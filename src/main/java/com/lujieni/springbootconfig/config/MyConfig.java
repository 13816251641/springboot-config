package com.lujieni.springbootconfig.config;


import com.lujieni.springbootconfig.entity.Student;
import org.springframework.beans.factory.annotation.Value;
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

    public String name="winning.dcg.event.collector.exchange";

    /**
     * 从配置文件中读取name字段的值从而修改当前类的成员变量name的值
     * 这一操作在@Bean之前!!!
     * @param value
     */
    @Value("${name}")
    private void setValue(String value){
        System.out.println(value);//lujieni
        System.out.println(name);//winning.dcg.event.collector.exchange
        name=value;
        System.out.println(name);//lujieni
    }


    /*
         引入Bean的方式二
     */
    @Bean("y")
    public Student y(){
        System.out.println(name);//读取name的值,已经变为lujieni
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