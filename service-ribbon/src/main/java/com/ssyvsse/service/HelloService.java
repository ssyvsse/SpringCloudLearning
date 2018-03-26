package com.ssyvsse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午10:23:07 
 */
@Service
public class HelloService {

	@Autowired
    RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
	
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
	
}
