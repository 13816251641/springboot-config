package com.lujieni.springbootconfig.config;

import com.lujieni.springbootconfig.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @Qualifier：在众多相同的bean中，@Qualifier指定需要注入的bean（该注解跟随在@Autowired后）
 * 下面的示例原本想通过@Qualifier注解区分不同bean,发现并没有用
 * @Auther ljn
 * @Date 2019/11/5
 */
@Configuration
public class BeanConfig {

    @Bean
    public String useStudent(@Qualifier("y") Student sone){
        System.out.println(sone.getName());
        return "hello";
    }


    @Bean("y")
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
    }


}
