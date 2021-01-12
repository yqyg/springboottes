package com.jy.controller;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@EnableScheduling
@Component
public class task {
    private static SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");

    @Scheduled(cron = "0/10 * * * * ? ")
    public void quartz(){

        System.out.println();
        System.out.println(time.format(new Date()));
    }
}
