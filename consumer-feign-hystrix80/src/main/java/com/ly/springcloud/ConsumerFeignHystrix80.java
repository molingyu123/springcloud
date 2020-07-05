package com.ly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix // 激活断路器
public class ConsumerFeignHystrix80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignHystrix80.class,args);
    }
}
