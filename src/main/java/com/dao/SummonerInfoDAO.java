package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;

public interface SummonerInfoDAO {

    SummonerInfo summonerDetails(String name) throws JsonProcessingException;
}
