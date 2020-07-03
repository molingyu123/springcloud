package com.ly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignHystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrix80.class,args);
    }
}
