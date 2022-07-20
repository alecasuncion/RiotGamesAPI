package com.service;

import com.dao.SummonerInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.net.URISyntaxException;
import java.util.List;

@Service
@Component
public class SummonerInfoServiceImpl implements SummonerInfoService {

    @Autowired
    private SummonerInfoDAO summonerInfoDAO;

    @Autowired
    private AccountInfoService accountInfoService;

    public SummonerInfo getSummonerDetails(String name) throws JsonProcessingException {
        try {
            SummonerInfo si = summonerInfoDAO.getSummonerDetails(name);
            AccountInfo ai = accountInfoService.getAccountValue(si.getPuuid());
            si.setGameName(ai.getGameName());
            si.setTagLine(ai.getTagLine());
            return si;
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }

    @Override
    public List<MatchId> getMatchIds(String puuid) throws JsonProcessingException {
        try {
            return summonerInfoDAO.getMatchIds(puuid);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }

    @Override
    public Match getMatchDetails(String matchId) throws JsonProcessingException {
        try {
            return summonerInfoDAO.getMatchDetails(matchId);
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }catch (URISyntaxException e){

        }
        return null;
    }

    @Override
    public List<Match> getMatches(String puuid) throws JsonProcessingException {
        return summonerInfoDAO.getMatches(puuid);
    }


}
