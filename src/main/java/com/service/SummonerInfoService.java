package com.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;

public interface SummonerInfoService {
    SummonerInfo summonerDetails(String name) throws JsonProcessingException;
}
