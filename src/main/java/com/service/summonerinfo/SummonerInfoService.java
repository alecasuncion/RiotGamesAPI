package com.service.summonerinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;

public interface SummonerInfoService {
    SummonerInfo getSummonerDetails(String name, String region) throws JsonProcessingException;
}
