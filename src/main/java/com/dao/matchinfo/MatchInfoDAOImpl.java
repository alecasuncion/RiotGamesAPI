package com.dao.matchinfo;

import com.dao.BaseDAOImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.types.PlatformEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Component
public class MatchInfoDAOImpl extends BaseDAOImpl implements MatchInfoDAO {

    @Override
    public List<String> getMatchIds(String puuid, String region, String start, String count, String startTime, String endTime) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String host = env.getProperty(PlatformEnum.getRegionHostByRegionCode(region));
        String url = host + env.getProperty("match.id.list.path") + puuid + "/ids";
        Map<String, String> params = new HashMap<String, String>();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        if(startTime!=null) builder.queryParam("startTime", startTime);
        if(endTime!=null) builder.queryParam("endTime", endTime);
        if(start!=null) builder.queryParam("start", start);
        if(count!=null) builder.queryParam("count", count);

        List<String> list = new ArrayList<>();
        list = (List<String>) executeHTTPCall(builder.toUriString(), HttpMethod.GET, header, list.getClass());
        return list;
    }

    @Override
    public Match getMatchDetails(String matchId, String region) throws JsonProcessingException, URISyntaxException {
        HttpEntity<Object> header = createHeader();
        String host = env.getProperty(PlatformEnum.getRegionHostByRegionCode(region));
        String url = host + env.getProperty("match.id.detail.path") + matchId;
        Match match = (Match) executeHTTPCall(url, HttpMethod.GET, header, Match.class);
        match.setMatchId(matchId);
        return match;
    }
}
