package com.ssyvsse.service;

import org.springframework.stereotype.Component;

/**
 * @author llb
 *
 * @Date 2018年3月26日 上午8:15:37 
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
