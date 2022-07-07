package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseDAOImpl {

    @Value("${riot.api.key}")
    private String token;

    @Value("${riot.origin.url}")
    private String origin;

    protected HttpEntity<Object> createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", token);
        headers.add("Origin", origin);
        return new HttpEntity<Object>(headers);
    }

    protected Object createObject(ResponseEntity<String> response, Object object) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(response.getBody(), object.getClass());
    }
}
