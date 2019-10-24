package com.lujieni.springbootconfig.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class ProfileConfig {
    @Bean
    public String readProfile(@Value("${env}") String env){
        log.info("env is {}",env);
        return env;
    }
}
