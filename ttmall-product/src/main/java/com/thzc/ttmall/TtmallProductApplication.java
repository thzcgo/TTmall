package com.thzc.ttmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@EnableFeignClients(basePackages = "com.thzc.ttmall.product.feign")
public class TtmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtmallProductApplication.class, args);
    }

}
