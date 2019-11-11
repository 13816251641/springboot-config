package com.lujieni.springbootconfig.config;


import com.lujieni.springbootconfig.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *  @Bean&@Import 标签如果没有@Configuration标签支持的话将会失效
 *  @Import标签一旦引入某个类,所有带有@Configuration标签的类都可以使用
 */
@Configuration
/*
    引入Bean的方式一
    @Import(Student.class)
*/
public class MyConfig {
    /*
         引入Bean的方式二
     */
    @Bean("y")
    public Student y(){
        Student y = new Student();
        y.setName("y");
        return y;
    }

    @Bean("s")
    public Student s(){
        Student s = new Student();
        s.setName("s");
        return s;
    }
}