package com.example.threaddemo.service.impl;

import com.example.threaddemo.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Liutx
 * @date 2021/6/5 17:23
 * @Description
 */
@Slf4j
@Service
public class AsyncServiceImpl implements AsyncService {

    @Resource(name = "taskExecutor")
    private ThreadPoolTaskExecutor taskExecutor;

    @Override
    public void processingTimeOperation() {

        /**
         *
         * 在此处理耗时操作业务逻辑，
         * 如数据量大的插入，只需要在业务层将List等段截取后的List在for循环中传入每一个List调用异步线程即可
         */
        try {
            log.info("进入异步");
            int activeCount = taskExecutor.getActiveCount();
            taskExecutor.submit(() -> log.info(String.valueOf(activeCount))).get();
            log.debug("当前线程信息：-{}", taskExecutor.getThreadNamePrefix() + taskExecutor.getActiveCount());
            log.info("异步体执行完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
