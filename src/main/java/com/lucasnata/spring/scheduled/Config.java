package com.lucasnata.spring.scheduled;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@Configuration
public class Config {

    @Bean
    public TaskBean taskBean() {
        return new TaskBean();
    }
}
