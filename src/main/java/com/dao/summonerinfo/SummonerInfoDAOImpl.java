package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


@Component
public class SummonerInfoDAOImpl extends BaseDAOImpl implements SummonerInfoDAO {

    public SummonerInfo getSummonerDetails(String name) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://jp1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + name;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        SummonerInfo summonerInfo = (SummonerInfo) createObject(response, SummonerInfo.class);
        return summonerInfo;
    }

    @Override
    public List<MatchId> getMatchIds(String puuid) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + puuid + "/ids";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        List<MatchId> list = new ArrayList<>();
        list= (List<MatchId>) createObject(response, list.getClass());
        return list;
    }

    @Override
    public Match getMatchDetails(String matchId) throws JsonProcessingException, URISyntaxException {
        HttpEntity<Object> header = createHeader();
        String url = "https://asia.api.riotgames.com/lol/match/v5/matches/" + matchId;
        RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
            Match match = (Match) createObject(response, Match.class);
            match.setMatchId(matchId);
            System.out.println("Response: " + response);
            return match;
    }

    @Override
    public List<Match> getMatches(String puuid) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://asia.api.riotgames.com/lol/match/v5/matches/by-puuid/" + puuid + "/ids";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        List<String> idList = new ArrayList<>();
        idList= (List<String>) createObject(response, idList.getClass());
        List<Match> matchList = new ArrayList<>();
        for(String matchId : idList){
            try {
                matchList.add(getMatchDetails(matchId));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }
        return matchList;
    }

}
