package com.buba.springclould.customer;

import com.buba.springclould.customer.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//name为生产者服务的服务名称  configuration为配置类的类名
@RibbonClient(name = "mcroservice-payment",configuration = MyselfRule.class)
public class CustomerMain {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMain.class,args);
    }
}

