package com.lujieni.springbootconfig.config.order;

import com.lujieni.springbootconfig.entity.Student;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ljn
 * @Date 2020/2/10
 */
@Configuration
@AutoConfigureOrder(-1)
public class FirstConfig {

    public FirstConfig(){
        System.out.println("FirstConfig");
    }

    @Bean
    public Student lujieni(){
        return new Student().setName("lujieni");
    }

    @Bean
    @ConditionalOnMissingBean(Person.class)
    public String getInFirst(){
        return "FirstConfig";
    }

}
