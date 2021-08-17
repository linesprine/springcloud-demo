package com.buba.springcloud.service02;

import com.buba.springcloud.dao02.PaymentDao02;
import com.buba.springcloud.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl02 implements PaymentService02 {
    @Autowired
    PaymentDao02 paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }
}
