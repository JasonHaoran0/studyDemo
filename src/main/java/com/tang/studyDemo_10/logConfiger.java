package com.tang.studyDemo_10;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class logConfiger {
    private static final Logger LOG = LoggerFactory.getLogger(logConfiger.class);

    @Bean
    public void getlog() {
        LOG.info("=============logintest==============");
    }
}
