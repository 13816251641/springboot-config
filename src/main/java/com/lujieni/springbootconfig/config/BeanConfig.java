package com.lujieni.springbootconfig.config;

import com.lujieni.springbootconfig.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * 下面的示例原本想通过@Qualifier注解区分不同bean发现并没有什么卵用,
 * 因为该标签必须和@Autowired标签一起使用,所以我们只能使用@Primary标签
 * @Auther ljn
 * @Date 2019/11/5
 */
@Configuration
public class BeanConfig {

 /*
    利用@Qualifier("y")无法区分多个bean
    @Bean
    public String useStudent(@Qualifier("y") Student sone){
        System.out.println(sone.getName());
        return "hello";
    }*/


  /*  @Bean("y")
    public Student y(){
        Student s = new Student();
        s.setName("s2");
        return s;
    }

    @Bean("s")
    public Student s(){
        Student s = new Student();
        s.setName("s1");
        return s;
    }*/


}
