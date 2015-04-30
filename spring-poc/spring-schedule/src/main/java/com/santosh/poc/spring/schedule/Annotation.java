package com.santosh.poc.spring.schedule;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author : Sadupa Wijeratne
 *         Date     : 2/9/15
 *         Time     : 8:03 PM
 */
@Service
@EnableScheduling
public class Annotation {
    @Scheduled(fixedDelay = 5000)
    public void fixedDelayTask() throws InterruptedException {
        System.out.println(new Date() + " This runs in a fixed delay");
    }

    @Scheduled(fixedRate = 6000)
    public void fixedRateTask() {
        System.out.println(new Date() + " This runs in a fixed rate");
    }

    @Scheduled(fixedRate = 7000, initialDelay = 2000)
    public void fixedRateWithInitialDelayTask(){
        System.out.println(new Date() + " This runs in a fixed delay with a initial delay");
    }

    @Scheduled(cron = "10 * * * * *")
    public void cronTask(){
        System.out.println(new Date() + " This runs in a cron schedule");
    }
}


