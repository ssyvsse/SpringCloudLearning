package com.ssyvsse;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午9:56:10
 */
@EnableDiscoveryClient // 激活eureka中的DiscoveryClient实现
@SpringBootApplication
public class ComputeServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
	}

}
