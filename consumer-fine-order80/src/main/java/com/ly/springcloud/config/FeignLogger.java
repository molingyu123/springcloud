package com.ly.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置OpenFeign 日志bean
 */
@Configuration
public class FeignLogger {

    @Bean
    Logger.Level feignLogLevel(){
         return Logger.Level.FULL;
    }

}
