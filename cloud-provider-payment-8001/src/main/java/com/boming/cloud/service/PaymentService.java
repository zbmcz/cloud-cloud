package com.boming.cloud.service;

import com.boming.cloud.dao.PaymentDao;
import com.boming.cloud.entities.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface PaymentService {

    public int add(PaymentEntity paymentEntity);

    public PaymentEntity getPaymentById(Long id);

}
