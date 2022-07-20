package com.service.accountinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;

public interface AccountInfoService {
    public AccountInfo getAccountDetails(String gameName, String tagLine, String String) throws JsonProcessingException;

    public AccountInfo getAccountDetails(String puuid, String region) throws JsonProcessingException;
}
