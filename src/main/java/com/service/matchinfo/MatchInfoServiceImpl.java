package com.service.matchinfo;

import com.dao.matchinfo.MatchInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.types.PlatformEnum;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Override
    public List<String> getMatchIds(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException{
        try {
            if(PlatformEnum.isInEnumByRegionCode(region)) {
                return matchInfoDAO.getMatchIds(puuid, region, start, count, startTime, endTime);
            }else{
                return new ArrayList<String>();
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }

    @Override
    public Match getMatchDetails(String matchId, String region) throws JsonProcessingException {
        try {
            if(PlatformEnum.isInEnumByRegionCode(region)) {
                return matchInfoDAO.getMatchDetails(matchId, region);
            }else{
                return null;
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }catch (URISyntaxException e){

        }
        return null;
    }

    @Override
    public List<Match> getMatches(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException {
        List<Match> matchList = new ArrayList<>();
        try {
            if(PlatformEnum.isInEnumByRegionCode(region)) {
                List<String> idList = getMatchIds(puuid, region, start, count, startTime, endTime);
                for (String id : idList) {
                    try {
                        matchList.add(getMatchDetails(id, region));
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else{
                return matchList;
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
        return matchList;
    }


}
