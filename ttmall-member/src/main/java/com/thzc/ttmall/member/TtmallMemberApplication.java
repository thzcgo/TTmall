package com.thzc.ttmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TtmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtmallMemberApplication.class, args);
    }

}

