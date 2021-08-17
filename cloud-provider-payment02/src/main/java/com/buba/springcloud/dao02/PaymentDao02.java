package com.buba.springcloud.dao02;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PaymentDao02 {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);

}