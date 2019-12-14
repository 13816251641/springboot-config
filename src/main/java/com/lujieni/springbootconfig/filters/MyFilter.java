package com.lujieni.springbootconfig.filters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Auther ljn
 * @Date 2019/12/14
 */
@Component
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("start to MyFilter");
        chain.doFilter(request, response);
    }
}
