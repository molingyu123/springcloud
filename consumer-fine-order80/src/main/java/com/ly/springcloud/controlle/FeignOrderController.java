package com.ly.springcloud.controlle;

import com.ly.springcloud.entity.CommonResult;
import com.ly.springcloud.entity.Payment;
import com.ly.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignOrderController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/feign/payment/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id){
        return paymentService.getPaymentById(id);
    }
}
