package com.lujieni.springbootconfig.service;

import com.lujieni.springbootconfig.annotation.MyAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Auther ljn
 * @Date 2019/11/28
 */
@Service
public class AnnotationService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @MyAnnotation
    public String say(String content){
        /*int i = 5/0;*/
        System.out.println("say方法执行");
        return content+"abc";
    }
}
