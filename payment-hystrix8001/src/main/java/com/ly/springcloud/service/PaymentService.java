package com.ly.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfoOk (Integer id){
       return "线程池:"+Thread.currentThread().getName()+" paymentInfoOk,id:"+id+"\t"+"haha";
    }

    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "1000")
    })
    public String paymentInfoTimeout (Integer id){
        int timeNumber =2;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" paymentInfoTimeout,id:"+id+"\t"+"耗时"+timeNumber+"秒钟";
    }

    public String paymentInfoTimeoutHandler (Integer id){
        return "线程池:"+Thread.currentThread().getName()+" paymentInfoTimeoutHanlder,id:"+id+"\t"+"请稍后再试";

    }
}
