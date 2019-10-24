package com.lujieni.springbootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootconfigApplication.class, args);
    }

}
