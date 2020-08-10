package com.thzc.ttmall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TtmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtmallProductApplication.class, args);
    }

}
