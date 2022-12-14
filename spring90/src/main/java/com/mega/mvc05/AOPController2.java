package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController2 {

	@Autowired
	AOPService2 service;
	
	@RequestMapping("aopError2.do")
	public void aop33() {
		try {
			service.error();
		} catch (Exception e) {
		}
	}
	
}
