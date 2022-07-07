package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AccountInfoDAOImpl extends BaseDAOImpl implements AccountInfoDAO {


    public AccountInfo accountValue(String gameName, String tagLine) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://americas.api.riotgames.com/riot/account/v1/accounts/by-riot-id/" + gameName + "/" + tagLine;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        System.out.println(response);
        AccountInfo accountInfo = new AccountInfo();
        accountInfo = (AccountInfo) createObject(response, new AccountInfo());
        return accountInfo;
    }

    public AccountInfo accountValue(String puuid) throws JsonProcessingException {
        HttpEntity<Object> header = createHeader();
        String url = "https://americas.api.riotgames.com/riot/account/v1/accounts/by-puuid/" + puuid;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, header, String.class);
        AccountInfo accountInfo = new AccountInfo();
        accountInfo = (AccountInfo) createObject(response, new AccountInfo());
        System.out.println(response);
        return accountInfo;
    }

}
