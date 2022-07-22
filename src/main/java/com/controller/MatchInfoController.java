package com.controller;

import com.controller.BaseController;
import com.dao.matchinfo.MatchInfoDAO;
import com.exception.ApiExceptionHandler;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.Match;
import com.model.MatchId;
import com.model.SummonerInfo;
import com.service.matchinfo.MatchInfoService;
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

import java.net.URISyntaxException;
import java.util.List;
import java.util.UUID;

@RestController
public class MatchInfoController extends BaseController {

    @Autowired
    public MatchInfoService matchInfoService;

    private static final Logger LOGGER = LogManager.getLogger(MatchInfoController.class);


    @GetMapping("matches/{puuid}/id")
    public Object getMatchIds(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region,
                                    @RequestParam(required = false, defaultValue = "0") String start,
                                    @RequestParam(required = false, defaultValue = "20") String count,
                                    @RequestParam(required = false) String startTime,
                                    @RequestParam(required = false) String endTime) throws JsonProcessingException, ApiRequestException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET matches/{puuid}/id: " + puuid);
        try {
            Object obj = matchInfoService.getMatchIds(puuid, region, start, count, startTime, endTime);
            LOGGER.info("END GET matches/{puuid}/id: " + puuid);
            return obj;
        }catch(Exception e){
                ApiExceptionHandler aeh = new ApiExceptionHandler();
                int status = ((HttpClientErrorException) e).getRawStatusCode();
                if (status == HttpStatus.NOT_FOUND.value()) {
                    ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                    LOGGER.error("GET matches/{puuid}/id: NOT_FOUND");
                    return obj;
                } else if (status== HttpStatus.BAD_REQUEST.value()){
                    ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                    LOGGER.error("GET matches/{puuid}/id: BAD_REQUEST");
                    return obj;
                }else if(status== HttpStatus.FORBIDDEN.value()){
                    ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                    LOGGER.error("GET matches/{puuid}/id: FORBIDDEN");
                    return obj;
                } else{
                    ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                    LOGGER.error("GET matches/{puuid}/id: SERVER_ERROR");
                    return obj;
                }
            }
    }

    @GetMapping("matches/{puuid}")
    public Object getMatches(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region,
                                  @RequestParam(required = false, defaultValue = "0") String start,
                                  @RequestParam(required = false, defaultValue = "20") String count,
                                  @RequestParam(required = false) String startTime,
                                  @RequestParam(required = false) String endTime) throws JsonProcessingException, ApiRequestException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET matches/{puuid}: " + puuid);
        try{
            Object obj = matchInfoService.getMatches(puuid, region, start, count, startTime, endTime);
            LOGGER.info("END GET matches/{puuid}: " + puuid);
            return obj;
        }catch(Exception e){
            ApiExceptionHandler aeh = new ApiExceptionHandler();
            int status = ((HttpClientErrorException) e).getRawStatusCode();
            if (status == HttpStatus.NOT_FOUND.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: NOT_FOUND");
                return obj;
            } else if (status== HttpStatus.BAD_REQUEST.value()){
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: BAD_REQUEST");
                return obj;
            }else if(status== HttpStatus.FORBIDDEN.value()){
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: FORBIDDEN");
                return obj;
            } else{
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET matches/{puuid}/id: SERVER_ERROR");
                return obj;
            }
        }
    }

    @GetMapping("match/{matchId}")
    public Object getMatchDetails(@PathVariable String matchId, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException, ApiRequestException, URISyntaxException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET match/{matchId}: " + matchId);
        try {
            Object obj = matchInfoService.getMatchDetails(matchId, region);
            LOGGER.info("END GET match/{matchId}: " + matchId);
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
