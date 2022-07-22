package com.service.matchinfo;

import com.dao.matchinfo.MatchInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.service.summonerinfo.SummonerInfoServiceImpl;
import com.types.PlatformEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class MatchInfoServiceImpl implements MatchInfoService {

    @Autowired
    private MatchInfoDAO matchInfoDAO;

    private static final Logger LOGGER = LogManager.getLogger(MatchInfoServiceImpl.class);


    @Override
    public List<String> getMatchIds(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException{
        if(PlatformEnum.isInEnumByRegionCode(region)) {
            List<String> list = matchInfoDAO.getMatchIds(puuid, region, start, count, startTime, endTime);
            LOGGER.info("GET Match IDs: Found Match ID List with PUUID: " + puuid);
            return list;
        }else{
            LOGGER.info("GET Match IDs: Invalid Region: " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Match getMatchDetails(String matchId, String region) throws JsonProcessingException, URISyntaxException {
        if(PlatformEnum.isInEnumByRegionCode(region)) {
            Match match = matchInfoDAO.getMatchDetails(matchId, region);
            LOGGER.info("GET Match Details: Found Match with ID: " + matchId);
            return match;
        }else{
            LOGGER.info("GET Match Details: Invalid Region: " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Match> getMatches(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException {
        List<Match> matchList = new ArrayList<>();
        if(PlatformEnum.isInEnumByRegionCode(region)) {
            List<String> idList = getMatchIds(puuid, region, start, count, startTime, endTime);
            for (String id : idList) {
                try {
                    matchList.add(getMatchDetails(id, region));
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            }
        }else{
            LOGGER.info("GET Matches: Invalid Region " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        if (!matchList.isEmpty()) {
            LOGGER.info("GET Matches: No Matches found");
        }else{
            LOGGER.info("GET Matches: Matches found");
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }

        return matchList;
    }


}
