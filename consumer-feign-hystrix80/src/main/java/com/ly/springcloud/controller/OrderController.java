package com.ly.springcloud.controller;

import com.ly.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/order/hystrix/ok/{id}")
    public String paymentInfoOk (@PathVariable("id") Integer id){
        return paymentService.paymentInfoOk(id);
    }

    @GetMapping("/order/hystrix/timeout/{id}")
    public String paymentInfoTimeOut (@PathVariable("id") Integer id){
        return paymentService.paymentInfoTimeOut(id);
    }
}
