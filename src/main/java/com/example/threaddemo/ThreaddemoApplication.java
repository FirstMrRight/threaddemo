package com.example.threaddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ThreaddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreaddemoApplication.class, args);
    }

}
