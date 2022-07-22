package com.service.accountinfo;

import com.dao.accountinfo.AccountInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.service.summonerinfo.SummonerInfoServiceImpl;
import com.types.PlatformEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoDAO accountInfoDAO;

    private static final Logger LOGGER = LogManager.getLogger(AccountInfoServiceImpl.class);

    public AccountInfo getAccountDetails(String gameName, String tagLine, String region) throws JsonProcessingException {
        if(PlatformEnum.isInEnumByRegionCode(region)) {
            AccountInfo ai = accountInfoDAO.getAccountDetails(gameName, tagLine, region);
            LOGGER.info("GET Account Details: Found Account Details with GameName#Tagline: " + gameName+"#"+tagLine);
            return ai;
        }else {
            LOGGER.info("GET Account Details: Invalid Region: " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    public AccountInfo getAccountDetails(String puuid, String region) throws JsonProcessingException {
        if(PlatformEnum.isInEnumByRegionCode(region)) {
            AccountInfo ai = accountInfoDAO.getAccountDetails(puuid, region);
            LOGGER.info("GET Account Details: Found Account Details with PUUID: " + puuid);
            return ai;
        }else{
            LOGGER.info("GET Account Details: Invalid Region: " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }
}
