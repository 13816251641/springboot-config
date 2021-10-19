package com.lujieni.springbootconfig.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Description: Environment对象可以获取.properties文件中的参数,如果没有就为空不会报错
 * @return:
 * @Author: lujieni
 * @Date: 2021/10/19
 */
@Configuration
@Slf4j
public class ProfileConfig {

    @Autowired
    private Environment environment;

    @Bean
    public String readProfile(@Value("${name}") String env){
        log.info("name is {}",env);
        log.info("name123 is "+environment.getProperty("name123"));
        return env;
    }


}
