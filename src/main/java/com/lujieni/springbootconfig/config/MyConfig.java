package com.lujieni.springbootconfig.config;


import com.lujieni.springbootconfig.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *  @Bean&@Import标签如果没有@Configuration标签支持的话将会失效
 *  @Import标签一旦引入某个类,所有带有@Configuration标签的类都可以使用
 */
@Configuration
@Import(Student.class)//引入Bean的方式一
public class MyConfig {
    /*
         引入Bean的方式二
         @Bean
         public Student createStudent(){
             return new Student();
         }*/

}
