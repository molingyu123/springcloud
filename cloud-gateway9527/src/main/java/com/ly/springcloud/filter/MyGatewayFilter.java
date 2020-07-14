package com.ly.springcloud.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 自定义网关过滤器
 * @author mly
 */
@Component
public class MyGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("自定义全局过滤器"+new Date());
        // 获取请求中的name 值
        String name = exchange.getRequest().getQueryParams().getFirst("name");
        if(name==null){
            System.out.println("非法字符");
            // 给用户一个响应
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        // ok 则放行带着响应进行下一步
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
