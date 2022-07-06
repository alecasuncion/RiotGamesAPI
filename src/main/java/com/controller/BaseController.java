package com.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    private String token = "RGAPI-d7f823f7-dedc-4315-8c20-9dc33e4ed2c2";
    private String origin = "https://developer.riotgames.com";

    protected HttpEntity<Object> createHeader(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", token);
        headers.add("Origin", origin);
        return new HttpEntity<Object>(headers);
    }
}
