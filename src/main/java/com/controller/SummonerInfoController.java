package com.controller;

import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;
import com.service.SummonerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerInfoController extends BaseController {

    @Autowired
    public SummonerInfoService summonerInfoService;


    @GetMapping("account/summoner/{name}")
    public SummonerInfo summonerDetails(@PathVariable String name) throws JsonProcessingException, ApiRequestException {
        return summonerInfoService.summonerDetails(name);
    }
}
