package com.lujieni.springbootconfig.config;

import com.lujieni.springbootconfig.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 下面的示例通过@Qualifier注解区分不同bean,
 * 同时也支持利用入参名来区分,同时也可以使用
 * @Primary来区分
 *
 * @Auther ljn
 * @Date 2019/11/5
 */
@Configuration
public class BeanConfig {

    /*
        利用@Qualifier("y")也可以区分多个bean
    */
    @Bean
    public String useStudent(@Qualifier("s") Student sone){
        System.out.println(sone.getName());
        return "hello";
    }

    /*
        利用Student s 指定入参名字也可以指定bean
     */
    @Bean
    public String useStudent2(Student s){
        System.out.println(s.getName());
        return "hello";
    }

}
