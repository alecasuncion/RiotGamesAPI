package com;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import java.util.UUID;

@SpringBootApplication
@EnableEncryptableProperties
@PropertySource("classpath:application.properties")
@Configurable
public class RiotGamesAPI {
    private static final Logger LOGGER = LogManager.getLogger(RiotGamesAPI.class);
    @Autowired
    private static Environment env = new Environment() {
        @Override
        public boolean containsProperty(String key) {
            return false;
        }

        @Override
        public String getProperty(String key) {
            return null;
        }

        @Override
        public String getProperty(String key, String defaultValue) {
            return null;
        }

        @Override
        public <T> T getProperty(String key, Class<T> targetType) {
            return null;
        }

        @Override
        public <T> T getProperty(String key, Class<T> targetType, T defaultValue) {
            return null;
        }

        @Override
        public String getRequiredProperty(String key) throws IllegalStateException {
            return null;
        }

        @Override
        public <T> T getRequiredProperty(String key, Class<T> targetType) throws IllegalStateException {
            return null;
        }

        @Override
        public String resolvePlaceholders(String text) {
            return null;
        }

        @Override
        public String resolveRequiredPlaceholders(String text) throws IllegalArgumentException {
            return null;
        }

        @Override
        public String[] getActiveProfiles() {
            return new String[0];
        }

        @Override
        public String[] getDefaultProfiles() {
            return new String[0];
        }

        @Override
        public boolean acceptsProfiles(String... profiles) {
            return false;
        }

        @Override
        public boolean acceptsProfiles(Profiles profiles) {
            return false;
        }
    };
    public static void main(String... args) {
        SpringApplication.run(RiotGamesAPI.class, args);
        env.getProperty("riot.api.key");
        LOGGER.info("SERVER START");

    }
}