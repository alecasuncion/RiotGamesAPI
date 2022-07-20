package com.service.accountinfo;

import com.dao.accountinfo.AccountInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.types.PlatformEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoDAO accountInfoDAO;

    public AccountInfo getAccountDetails(String gameName, String tagLine, String region) throws JsonProcessingException {
        try {
            if(PlatformEnum.isInEnumByRegionCode(region)) {
                return accountInfoDAO.getAccountDetails(gameName, tagLine, region);
            }else {
                return null;
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }

    public AccountInfo getAccountDetails(String puuid, String region) throws JsonProcessingException {
        try {
            if(PlatformEnum.isInEnumByRegionCode(region)) {
                return accountInfoDAO.getAccountDetails(puuid, region);
            }else{
                return null;
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        } catch (HttpClientErrorException.BadRequest e) {
            throw new ApiRequestException();
        }
    }
}
