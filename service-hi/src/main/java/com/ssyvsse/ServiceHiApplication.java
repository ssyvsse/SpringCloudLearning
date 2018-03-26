package com.ssyvsse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午10:41:58
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;
	}

}
