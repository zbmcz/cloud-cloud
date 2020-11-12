package com.boming.cloud.controller;

import com.boming.cloud.model.CommonResult;
import com.boming.cloud.entities.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer/order")
public class OrderController {

    // private static final String PAYMENT_URL = "http://localhost:8001/provider/payment";

    private static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT/provider/payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public CommonResult add(PaymentEntity paymentEntity){
        return restTemplate.postForObject(PAYMENT_URL + "/add", paymentEntity, CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult<PaymentEntity> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/get/" + id, CommonResult.class);
    }

}
