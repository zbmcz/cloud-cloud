package com.boming.cloud.controller;

import com.boming.cloud.entities.PaymentEntity;
import com.boming.cloud.model.CommonResult;
import com.boming.cloud.service.PaymentService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@XSlf4j
@RestController("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public CommonResult add(@RequestBody PaymentEntity paymentEntity){
        int id = paymentService.add(paymentEntity);
        if(id == 0){
            return new CommonResult(0, "新增失败", null);
        }
        return new CommonResult(200, "新增成功", id);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return new CommonResult(200, "查询成功", paymentService.getPaymentById(id));
    }


}
