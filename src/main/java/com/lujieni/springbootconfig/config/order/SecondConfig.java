package com.lujieni.springbootconfig.config.order;

import com.lujieni.springbootconfig.entity.Student;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther ljn
 * @Date 2020/2/10
 * AutoConfigureOrder的确能控制带有@Bean方法的执行顺序,
 * 但当入参的Bean没有的时候会先去生成该Bean,即到别的config
 * 中生成
 */
@Configuration
@AutoConfigureOrder(0)
public class SecondConfig {

    public SecondConfig(){
        System.out.println("SecondConfig");
    }


    /**
     * Student的实例lujieni在FirstConfig里配置,
     * 所以springboot会跑到FirstConfig里进行配置
     * @param lujieni
     * @return
     */
    @Bean
    public String getStudent(Student lujieni){
        System.out.println("getStudent");
        return lujieni.getName();
    }


    @Bean
    public String getInSecond(){
        return "SecondConfig";
    }

    @Bean
    public Person getPerson(){
        return new Person();
    }
}
