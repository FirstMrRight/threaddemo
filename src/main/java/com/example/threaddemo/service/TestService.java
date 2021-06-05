package com.example.threaddemo.service;

import org.springframework.scheduling.annotation.Async;


/**
 * @author Liu-PC
 */
public interface TestService {

    @Async("taskExecutor")
    void business();
}
