package com.lujieni.springbootconfig.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * 提供一个含有2个线程的线程池供定时任务调用
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        /*设定一个长度2的定时任务线程池*/
        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(2));
    }
}
