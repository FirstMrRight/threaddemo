package com.example.threaddemo.controller;

import com.example.threaddemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Liutx
 * @date 2021/6/5 17:48
 * @Description
 */

@Slf4j
@RestController
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("asyncTest")
    public void test() {
        /**
         * 请注意,异步注解一定要使用在主线程的业务Service中
         * 这样才能等主线程任务开始后，子线程才会进入任务队列
         *
         */
        testService.business();
        log.info("主线程执行完毕");
    }
}
