package com.ly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  // 使用Fine 并激活
public class FineOrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(FineOrderMain80.class,args);
    }
}
