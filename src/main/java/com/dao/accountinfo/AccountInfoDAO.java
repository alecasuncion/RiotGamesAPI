package com.dao.accountinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;


public interface AccountInfoDAO {
    public AccountInfo getAccountDetails(String gameName, String tagLine, String region) throws JsonProcessingException;

    public AccountInfo getAccountDetails(String puuid, String region) throws JsonProcessingException;

}
