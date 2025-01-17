package com.central;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zlt
 * @date 2019/10/5
 * <p>
 * Blog: https://blog.csdn.net/zlt2000
 * Github: https://github.com/zlt2000
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SCGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(SCGatewayApp.class, args);
    }
}