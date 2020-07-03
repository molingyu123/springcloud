package com.ly.springcloud.service;

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

    public String paymentInfoTimeout (Integer id){
        int timeNumber =3;
        try{
            TimeUnit.SECONDS.sleep(timeNumber);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池:"+Thread.currentThread().getName()+" paymentInfoTimeout,id:"+id+"\t"+"耗时"+timeNumber+"秒钟";
    }
}
