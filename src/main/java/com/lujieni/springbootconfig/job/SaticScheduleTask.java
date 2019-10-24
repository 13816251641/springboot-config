package com.lujieni.springbootconfig.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
//@Service
public class SaticScheduleTask {

    private int fixedDelayCount = 1;

    /*fixedDelay=5000表示当前方法执行完毕5000ms后，Spring scheduling会再次调用该方法*/
    @Scheduled(fixedDelay = 1000)
    public void job() throws Exception {
        Thread.sleep(15 * 1000);
        log.info("job");
    }

    @Scheduled(fixedRate = 1000)
    public void job2() throws Exception {
        log.info("job2");
    }


}