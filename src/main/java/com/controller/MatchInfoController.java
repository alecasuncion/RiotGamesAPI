package com.controller;

import com.controller.BaseController;
import com.dao.matchinfo.MatchInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import com.service.matchinfo.MatchInfoService;
import com.service.summonerinfo.SummonerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
public class MatchInfoController extends BaseController {

    @Autowired
    public MatchInfoService matchInfoService;


    @GetMapping("matches/{puuid}/id")
    public List<String> getMatchIds(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region,
                                    @RequestParam(required = false, defaultValue = "0") String start,
                                    @RequestParam(required = false, defaultValue = "20") String count,
                                    @RequestParam(required = false) String startTime,
                                    @RequestParam(required = false) String endTime) throws JsonProcessingException, ApiRequestException {
        return matchInfoService.getMatchIds(puuid, region, start, count, startTime, endTime);
    }

    @GetMapping("matches/{puuid}")
    public List<Match> getMatches(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region,
                                  @RequestParam(required = false, defaultValue = "0") String start,
                                  @RequestParam(required = false, defaultValue = "20") String count,
                                  @RequestParam(required = false) String startTime,
                                  @RequestParam(required = false) String endTime) throws JsonProcessingException, ApiRequestException {
        return matchInfoService.getMatches(puuid, region, start, count, startTime, endTime);
    }

    @GetMapping("match/{matchId}")
    public Match getMatchDetails(@PathVariable String matchId, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException, ApiRequestException, URISyntaxException {
        return matchInfoService.getMatchDetails(matchId, region);
    }
}
