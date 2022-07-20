package com.controller;

import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import com.service.summonerinfo.SummonerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SummonerInfoController extends BaseController {

    @Autowired
    public SummonerInfoService summonerInfoService;


    @GetMapping("summoner/{name}")
    public SummonerInfo getSummonerDetails(@PathVariable String name, @RequestParam(required = false, defaultValue = "JP1") String platformCode) throws JsonProcessingException, ApiRequestException {
        return summonerInfoService.getSummonerDetails(name, region);
    }

}
