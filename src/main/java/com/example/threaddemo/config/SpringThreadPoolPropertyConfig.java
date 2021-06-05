package com.example.threaddemo.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * @author Liu-PC
 */
@Getter
@Setter
@Component
/**
 * prefix只能使用全部小写
 */
@ConfigurationProperties(prefix = "threadpool.property")
public class SpringThreadPoolPropertyConfig {

    private Integer corePoolSize;

    private Integer maxPoolSize;

    private Integer keepAliveSeconds;

    private Integer queueCapacity;

    private Integer awaitTerminationSeconds;

    private String threadNamePrefix;

    private Boolean waitForTasksToCompleteOnShutdown;
}
