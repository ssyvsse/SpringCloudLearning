package com.ssyvsse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssyvsse.service.SchedualServiceHi;

/**
 * @author llb
 *
 * @Date 2018年3月25日 下午11:12:34
 */
@RestController
public class HiController {
	
	@Autowired
	private SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi(@RequestParam String name) {
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
