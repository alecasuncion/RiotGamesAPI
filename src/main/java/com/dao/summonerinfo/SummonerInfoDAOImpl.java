package com.dao.summonerinfo;

import com.dao.BaseDAOImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.SummonerInfo;
import com.types.PlatformEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;


@Component
public class SummonerInfoDAOImpl extends BaseDAOImpl implements SummonerInfoDAO {

    public SummonerInfo getSummonerDetails(String name, String region) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String host = env.getProperty(PlatformEnum.getHostByName(region));
        String url = host + env.getProperty("summoner.name.detail.path") + name;
        return (SummonerInfo) executeHTTPCall(url, HttpMethod.GET, header, SummonerInfo.class);
    }

}
