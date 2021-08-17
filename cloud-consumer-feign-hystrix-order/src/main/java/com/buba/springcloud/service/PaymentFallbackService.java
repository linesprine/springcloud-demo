package com.buba.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: Admin
 * @date: 2021年08月16日 15:27
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_OK 服务器出现故障,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService fall  paymentInfo_TimeOut 服务器出现故障,o(╥﹏╥)o";
    }
}