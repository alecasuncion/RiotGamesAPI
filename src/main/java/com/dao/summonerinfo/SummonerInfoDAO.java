package com.dao.summonerinfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;

public interface SummonerInfoDAO {

    SummonerInfo getSummonerDetails(String name, String region) throws JsonProcessingException;
}
