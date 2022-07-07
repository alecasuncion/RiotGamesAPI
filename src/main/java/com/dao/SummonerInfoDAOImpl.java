package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerInfoDAOImpl extends BaseDAOImpl implements SummonerInfoDAO {

    public SummonerInfo summonerDetails(String name) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://jp1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + name;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        SummonerInfo summonerInfo = new SummonerInfo();
        summonerInfo = (SummonerInfo) createObject(response, summonerInfo);
        System.out.println("Response: " + response);
        return summonerInfo;
    }
}
