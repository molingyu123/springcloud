package com.ly.springcloud.controller;

import com.ly.springcloud.service.IMssageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mly
 *
 */
@RestController
public class SendMessageController {

    @Resource
    private IMssageProviderService iMssageProviderService;

    @GetMapping("/sendMessage")
    public String getMessage(){
        return iMssageProviderService.send();
    }
}
