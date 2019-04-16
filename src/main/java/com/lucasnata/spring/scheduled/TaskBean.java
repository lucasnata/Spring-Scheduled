package com.lucasnata.spring.scheduled;

import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalTime;

public class TaskBean {

    @Scheduled(fixedRate = 1000)
    public void runTask() {
        System.out.printf("Running scheduled task " +
                        " thread: %s, time: %s%n",
                Thread.currentThread().getName(),
                LocalTime.now());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
