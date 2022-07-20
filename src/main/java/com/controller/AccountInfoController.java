package com.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.AccountInfo;
import com.service.accountinfo.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountInfoController extends BaseController {

    @Autowired
    private AccountInfoService accountInfoService;

    @GetMapping("account/{gameName}/{tagLine}")
    AccountInfo getAccountValue(@PathVariable String gameName, @PathVariable String tagLine, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException {
        return accountInfoService.getAccountDetails(gameName, tagLine, region);
    }

    @GetMapping("account/{puuid}")
    AccountInfo getAccountValue(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException {
        return accountInfoService.getAccountDetails(puuid, region);
    }

}
