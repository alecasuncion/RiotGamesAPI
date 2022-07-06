package com.controller;

import com.model.AccountInfo;
import com.service.AccountInfoServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountInfoController extends BaseController{

    @Autowired
    private AccountInfoServiceImpl accountInfoServiceImpl;

    @GetMapping("account/{gameName}/{tagLine}")
    AccountInfo accountValue(@PathVariable String gameName, @PathVariable String tagLine) throws JsonProcessingException {
        return accountInfoServiceImpl.accountValue(gameName, tagLine);
    }

    @GetMapping("account/{puuid}")
    AccountInfo accountValue(@PathVariable String puuid) throws JsonProcessingException {
        return accountInfoServiceImpl.accountValue(puuid);
    }

    protected AccountInfo createAccountObject(ResponseEntity<String> response) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(response.getBody(), AccountInfo.class);
    }
}
