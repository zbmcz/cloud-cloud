package com.boming.cloud.service;

import com.boming.cloud.entities.PaymentEntity;

public interface PaymentService {

    public long add(PaymentEntity paymentEntity);

    public PaymentEntity getPaymentById(Long id);

}
