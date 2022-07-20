package com.model;


import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EncryptablePropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
@EnableEncryptableProperties
@EncryptablePropertySource(name = "EncryptedProperties", value = "classpath:encrypted.properties")
public  class BaseClass {
    @Autowired
    public Environment env;
}
