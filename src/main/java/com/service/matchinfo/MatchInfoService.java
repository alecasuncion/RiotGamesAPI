package com.service.matchinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;

import java.net.URISyntaxException;
import java.util.List;

public interface MatchInfoService {

    List<String> getMatchIds(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException;

    Match getMatchDetails(String matchId, String region) throws JsonProcessingException, URISyntaxException;

    List<Match> getMatches(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException;
}
