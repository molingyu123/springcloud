package com.ly.myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡规则
 */
@Configuration
public class MyRule {

    @Bean
    public IRule myRule2(){
        return new RandomRule();
    }

}
