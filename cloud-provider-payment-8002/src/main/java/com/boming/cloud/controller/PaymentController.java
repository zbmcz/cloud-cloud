package com.boming.cloud.controller;

import com.boming.cloud.entities.PaymentEntity;
import com.boming.cloud.model.CommonResult;
import com.boming.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

//@XSlf4j
@RestController
@RequestMapping("/provider/payment")
public class PaymentController {

    @Value("${server.port}")
    private String localPort;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public CommonResult add(@RequestBody PaymentEntity paymentEntity){
        long id = paymentService.add(paymentEntity);
        if(id == 0){
            return new CommonResult<String>(0, "新增失败(localPort:" + localPort + ")", "");
        }
        return new CommonResult<Long>(200, "新增成功(localPort:" + localPort + ")", id);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return new CommonResult<PaymentEntity>(200, "查询成功(localPort:" + localPort + ")", paymentService.getPaymentById(id));
    }


}
