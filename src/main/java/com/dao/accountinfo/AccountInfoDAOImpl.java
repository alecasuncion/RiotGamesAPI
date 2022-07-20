package com.dao.accountinfo;

import com.dao.BaseDAOImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.types.PlatformEnum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;

@Component
public class AccountInfoDAOImpl extends BaseDAOImpl implements AccountInfoDAO {


    public AccountInfo getAccountDetails(String gameName, String tagLine, String region) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String host = env.getProperty(PlatformEnum.getRegionHostByRegionCode(region));
        String url = host + env.getProperty("account.gamename.tagline.detail.path") + gameName + "/" + tagLine;
        return (AccountInfo) executeHTTPCall(url, HttpMethod.GET, header, AccountInfo.class);

    }

    public AccountInfo getAccountDetails(String puuid, String region) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String host = env.getProperty(PlatformEnum.getRegionHostByRegionCode(region));
        String url = host + env.getProperty("account.puuid.detail.path") + puuid;
        return (AccountInfo) executeHTTPCall(url, HttpMethod.GET, header, AccountInfo.class);
    }

}
