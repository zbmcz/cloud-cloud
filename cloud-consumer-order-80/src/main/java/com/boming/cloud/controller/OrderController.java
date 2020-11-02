package com.boming.cloud.controller;

import com.boming.cloud.common.CommonResult;
import com.boming.cloud.entities.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/consumer/order")
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001/provider/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(PaymentEntity paymentEntity){
        //this.restTemplate.
        return null;
    }

}
