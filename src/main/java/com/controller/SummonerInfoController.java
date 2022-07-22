package com.controller;

import com.exception.ApiExceptionHandler;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import com.service.summonerinfo.SummonerInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.UUID;

@RestController
public class SummonerInfoController extends BaseController {

    @Autowired
    public SummonerInfoService summonerInfoService;

    private static final Logger LOGGER = LogManager.getLogger(MatchInfoController.class);

    @GetMapping("summoner/{name}")
    public Object getSummonerDetails(@PathVariable String name, @RequestParam(required = false, defaultValue = "JP1") String platformCode) throws JsonProcessingException, ApiRequestException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET summoner/{name}: " + name);
        try{
            Object obj = summonerInfoService.getSummonerDetails(name, platformCode);
            LOGGER.info("END GET summoner/{name}: " + name);
            return obj;
        } catch (Exception e) {
            ApiExceptionHandler aeh = new ApiExceptionHandler();
            int status = ((HttpClientErrorException) e).getRawStatusCode();
            if (status == HttpStatus.NOT_FOUND.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: NOT_FOUND");
                return obj;
            } else if (status == HttpStatus.BAD_REQUEST.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: BAD_REQUEST");
                return obj;
            } else if (status == HttpStatus.FORBIDDEN.value()) {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: FORBIDDEN");
                return obj;
            } else {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: SERVER_ERROR");
                return obj;
            }
        }
    }

}
