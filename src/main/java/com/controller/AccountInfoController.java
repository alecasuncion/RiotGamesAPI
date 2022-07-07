package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.AccountInfo;
import com.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountInfoController extends BaseController {

    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping("account/{gameName}/{tagLine}")
    AccountInfo accountValue(@PathVariable String gameName, @PathVariable String tagLine) throws JsonProcessingException {
        return accountInfoService.accountValue(gameName, tagLine);
    }

    @GetMapping("account/{puuid}")
    AccountInfo accountValue(@PathVariable String puuid) throws JsonProcessingException {
        return accountInfoService.accountValue(puuid);
    }

    protected AccountInfo createAccountObject(ResponseEntity<String> response) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(response.getBody(), AccountInfo.class);
    }
}
