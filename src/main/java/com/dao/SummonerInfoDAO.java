package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;
import org.springframework.web.bind.annotation.PathVariable;

public interface SummonerInfoDAO {

    SummonerInfo summonerDetails(String name) throws JsonProcessingException;
}
