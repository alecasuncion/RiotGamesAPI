package com.exception;

import com.model.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    //    @ResponseBody
//    @ExceptionHandler(ApiRequestException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    String SummonerNameNotFoundException(ApiRequestException ex) {
//        return ex.getMessage();
//    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Object> getNotFoundExceptionHandler(ApiRequestException e) {
        ApiException apiException = new ApiException("No Record Found", HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(apiException, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> getServerExceptionHandler(ApiRequestException e) {
        ApiException apiException = new ApiException("Error connecting to Server", HttpStatus.INTERNAL_SERVER_ERROR, ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(apiException, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
