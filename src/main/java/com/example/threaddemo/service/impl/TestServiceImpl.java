package com.example.threaddemo.service.impl;

import com.example.threaddemo.service.AsyncService;
import com.example.threaddemo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liutx
 * @date 2021/6/5 17:16
 * @Description
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private AsyncService asyncService;

    @Override
    public void business() {
        //其他业务逻辑
        List<Integer> businessList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            log.info("开始异步");
            asyncService.processingTimeOperation();
            businessList.add(i);
            log.info("执行异步完毕");
        }
    }
}
