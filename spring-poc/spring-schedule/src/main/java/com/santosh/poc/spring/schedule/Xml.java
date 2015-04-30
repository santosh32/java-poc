package com.santosh.poc.spring.schedule;

import java.util.Date;

/**
 * @author : Sadupa Wijeratne
 *         Date     : 2/9/15
 *         Time     : 8:03 PM
 */
public class Xml {
    public void xmlFixedDelayTask() {
        System.out.println(new Date() + " This task runs in fixed delay by xml configuration");
    }

    public void xmlFixedRateTask() {
        System.out.println(new Date() + " This task runs in fixed rate by xml configuration");
    }

    public void xmlCronTask() {
        System.out.println(new Date() + " This task runs in a cron schedule by xml configuration");
    }
}
