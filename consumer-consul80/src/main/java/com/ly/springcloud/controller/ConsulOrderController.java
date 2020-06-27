package com.ly.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsulOrderController {

    @Resource
    private RestTemplate restTemplate;

    public static final String INVOKE_URL="http://consul-provider-payment";

    @GetMapping(value = "/order/consul")
    public String getInfoData(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
    }
}
