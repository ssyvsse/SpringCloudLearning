package com.ssyvsse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午9:48:06
 */
@EnableEurekaServer // 启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class ServerApplication {
	
	public static void main(String[] args) {
		// 下面两行代码都可以用来启动
		SpringApplication.run(ServerApplication.class, args);
		//new SpringApplicationBuilder(ServerApplication.class).bannerMode(Banner.Mode.OFF).web(true).run(args);
	}
}
