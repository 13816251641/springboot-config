package com.lujieni.springbootconfig.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ScheduleTask {
    /**
       fixedDelay=2000表示当前方法执行完毕2000ms后，
       Spring scheduling会再次调用该方法
     */
    @Scheduled(fixedDelay = 2000)
    public void useFixDelay() throws InterruptedException {
        Thread.sleep(3 * 1000);
        log.info("job");
    }


    /**
     * 上一次开始执行时间点后2秒再次执行
     * @throws InterruptedException
     */
    @Scheduled(fixedRate = 2000)
    public void useFixRate() throws InterruptedException{
        Thread.sleep(5000);
        log.info("job2");
    }


}