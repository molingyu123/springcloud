package com.ly.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author mly
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3346 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain3346.class,args);
    }
}
