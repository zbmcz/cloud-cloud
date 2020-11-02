package com.boming.cloud.dao;

import com.boming.cloud.entities.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int add(PaymentEntity paymentEntity);

    public PaymentEntity getPaymentById(@Param("id") Long id);

}
