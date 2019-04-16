package com.lucasnata.spring.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        TaskBean bean = context.getBean(TaskBean.class);

        System.out.printf("calling TaskBean#runTask() thread: %s%n", Thread.currentThread().getName());
        bean.runTask();
        System.out.println("call TaskBean#runTask() returned");

        Thread.sleep(5000);
        System.exit(0);
    }
}
