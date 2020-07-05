package com.ly.springcloud.service.impl;

import com.ly.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author mly
 */
@Component
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String paymentInfoOk(Integer id) {
        return "-----PaymentService fall back ok";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentService fall back timeout";
    }
}
