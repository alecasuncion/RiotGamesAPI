package com.service;

import com.dao.AccountInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private AccountInfoDAO accountInfoDAO;

    public AccountInfo getAccountValue(String gameName, String tagLine) throws JsonProcessingException {
        try {
            return accountInfoDAO.accountValue(gameName, tagLine);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }

    public AccountInfo getAccountValue(String puuid) throws JsonProcessingException {
        try {
            return accountInfoDAO.accountValue(puuid);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        } catch (HttpClientErrorException.BadRequest e) {
            throw new ApiRequestException();
        }
    }
}
