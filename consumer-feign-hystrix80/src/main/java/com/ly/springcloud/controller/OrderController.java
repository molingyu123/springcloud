package com.ly.springcloud.controller;

import com.ly.springcloud.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@DefaultProperties(defaultFallback = "paymentGlobalFallback")
public class OrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/order/hystrix/ok/{id}")
    public String paymentInfoOk (@PathVariable("id") Integer id){
        return paymentService.paymentInfoOk(id);
    }

    @GetMapping("/order/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "consumerTimeOutFallback",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "800")
//    })
    @HystrixCommand
    public String paymentInfoTimeOut (@PathVariable("id") Integer id){
        return paymentService.paymentInfoTimeOut(id);
    }

    public String consumerTimeOutFallback(@PathVariable("id") Integer id){
        return "我是消费者80 系统繁忙请稍后重试！"+id;
    }

    /**
     * 全局的处理 fallback 方法
     * @return
     */
    public String paymentGlobalFallback(){
        return "Global 异常处理信息,请稍后重试！";
    }
}
