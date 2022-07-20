package com.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;

import java.util.List;

public interface SummonerInfoService {
    SummonerInfo getSummonerDetails(String name) throws JsonProcessingException;

    List<MatchId> getMatchIds(String puuid) throws JsonProcessingException;

    Match getMatchDetails(String matchId) throws JsonProcessingException;

    List<Match> getMatches(String puuid) throws JsonProcessingException;
}
