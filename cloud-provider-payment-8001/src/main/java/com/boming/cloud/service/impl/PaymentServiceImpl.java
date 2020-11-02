package com.boming.cloud.service.impl;

import com.boming.cloud.dao.PaymentDao;
import com.boming.cloud.entities.PaymentEntity;
import com.boming.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public long add(PaymentEntity paymentEntity) {
        return paymentDao.add(paymentEntity);
    }

    @Override
    public PaymentEntity getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
