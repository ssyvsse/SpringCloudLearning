package com.ssyvsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午11:11:14 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

	public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
	
}
