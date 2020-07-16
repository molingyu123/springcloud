package com.ly.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mly
 */
@RestController
public class ConfigClientController {

    @Value("${spring.cloud.config}")
    private String configInfo;

    @GetMapping("/getInfo")
    public String getConfig(){
        return configInfo;
    }
}
