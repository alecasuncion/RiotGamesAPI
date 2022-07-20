package com;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource("classpath:application.properties")
@Configurable
public class RiotGamesAPI {
    public static void main(String... args) {
        SpringApplication.run(RiotGamesAPI.class, args);
    }
}