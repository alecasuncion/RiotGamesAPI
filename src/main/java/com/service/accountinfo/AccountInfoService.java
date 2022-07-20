package com.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;

public interface AccountInfoService {
    public AccountInfo getAccountValue(String gameName, String tagLine) throws JsonProcessingException;

    public AccountInfo getAccountValue(String puuid) throws JsonProcessingException;
}
