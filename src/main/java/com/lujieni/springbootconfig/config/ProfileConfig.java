package com.lujieni.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfig {

    @Bean
    public String readProfile(@Value("${env}") String env){
        System.out.println(env);
        return env;
    }
}
