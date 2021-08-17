package com.buba.springcloud.service02;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService02 {
    int create(Payment payment);

    Payment queryById(@Param("id")long id);

}
