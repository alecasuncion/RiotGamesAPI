package com.dao;

import com.exception.ApiExceptionHandler;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.BaseClass;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class BaseDAOImpl extends BaseClass {

    protected HttpEntity<Object> createHeader() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Riot-Token", env.getProperty("riot.api.key"));
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<Object>(headers);
    }

    protected Object createObject(ResponseEntity<String> response, Class classType) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        return om.readValue(response.getBody(), classType);
    }

    protected Object executeHTTPCall(String url, HttpMethod method, HttpEntity<Object> header, Class clazz) throws JsonProcessingException {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.exchange(url, method, header, String.class);
            return createObject(response, clazz);
    }
}
