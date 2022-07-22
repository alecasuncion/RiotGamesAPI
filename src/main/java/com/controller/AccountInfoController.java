package com.controller;

import com.exception.ApiExceptionHandler;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.AccountInfo;
import com.service.accountinfo.AccountInfoService;
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

import java.util.UUID;

@RestController
public class AccountInfoController extends BaseController {

    @Autowired
    private AccountInfoService accountInfoService;

    private static final Logger LOGGER = LogManager.getLogger(AccountInfoController.class);

    @GetMapping("account/{gameName}/{tagLine}")
    Object getAccountValue(@PathVariable String gameName, @PathVariable String tagLine, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET account/{gameName}/{tagLine}: " + gameName + " " + tagLine);
        try{
            Object obj = accountInfoService.getAccountDetails(gameName, tagLine, region);
            LOGGER.info("END GET account/{gameName}/{tagLine}: " + gameName + " " + tagLine);
            return obj;
        } catch (Exception e) {
            ApiExceptionHandler aeh = new ApiExceptionHandler();
            int status = ((HttpClientErrorException) e).getRawStatusCode();
            if (status == HttpStatus.NOT_FOUND.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: NOT_FOUND");
                return obj;
            } else if (status == HttpStatus.BAD_REQUEST.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: BAD_REQUEST");
                return obj;
            } else if (status == HttpStatus.FORBIDDEN.value()) {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: FORBIDDEN");
                return obj;
            } else {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: SERVER_ERROR");
                return obj;
            }
        }
    }

    @GetMapping("account/{puuid}")
    Object getAccountValue(@PathVariable String puuid, @RequestParam(required = false, defaultValue = "Asia") String region) throws JsonProcessingException {
        ThreadContext.put("uniqueID", UUID.randomUUID().toString());
        LOGGER.info("START GET account/{puuid}: " + puuid);
        try{
            Object obj = accountInfoService.getAccountDetails(puuid, region);
            LOGGER.info("END GET account/{puuid}: " + puuid);
            return obj;
        } catch (Exception e) {
            ApiExceptionHandler aeh = new ApiExceptionHandler();
            int status = ((HttpClientErrorException) e).getRawStatusCode();
            if (status == HttpStatus.NOT_FOUND.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: NOT_FOUND");
                return obj;
            } else if (status == HttpStatus.BAD_REQUEST.value()) {
                ResponseEntity<Object> obj = aeh.getNotFoundExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: BAD_REQUEST");
                return obj;
            } else if (status == HttpStatus.FORBIDDEN.value()) {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: FORBIDDEN");
                return obj;
            } else {
                ResponseEntity<Object> obj = aeh.getServerExceptionHandler(new ApiRequestException());
                LOGGER.error("GET account/{puuid}: SERVER_ERROR");
                return obj;
            }
        }
    }

}
