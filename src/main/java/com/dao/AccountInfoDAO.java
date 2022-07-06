package com.dao;

import com.model.AccountInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;


public interface AccountInfoDAO {
    public AccountInfo accountValue(String gameName, String tagLine) throws JsonProcessingException;
    public AccountInfo accountValue(String puuid) throws JsonProcessingException;
}
