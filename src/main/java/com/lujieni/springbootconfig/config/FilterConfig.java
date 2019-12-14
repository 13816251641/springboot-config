package com.lujieni.springbootconfig.config;

import com.lujieni.springbootconfig.filters.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.net.httpserver.AuthFilter;

import javax.servlet.FilterRegistration;

/**
 * @Auther ljn
 * @Date 2019/12/14
 */
@Configuration
public class FilterConfig {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean registerMyFilter(){
        FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(myFilter);
        filterRegistrationBean.addUrlPatterns("/*");
        return  filterRegistrationBean;
    }




}
