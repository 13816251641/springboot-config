package com.lujieni.springbootconfig.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Package: com.lujieni.springbootconfig.runner
 * @ClassName: FirstRunner
 * @Author: lujieni
 * @Description: 系统启动完可以做一些业务操作
 * @Date: 2021-10-20 14:34
 * @Version: 1.0
 */
@Component
public class FirstRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("FirstRunner-run");
    }

}