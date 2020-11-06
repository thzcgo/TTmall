package com.thzc.ttmall.product.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "ttmall.thread")
@Component
@Data
public class ThreadPoolConfigProperties {

    // 核心线程数
    private Integer coreSize;
    // 最大数量
    private Integer maxSize;
    // 休眠时间
    private Integer keepAliveTime;

}