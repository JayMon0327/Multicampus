package com.multi.mvc03;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//@Component("aop")  ==> @Inject("aop") 
//@Aspect
public class AOPClass {

	public void login() {
		System.out.println("$$$$$$$$$$$로그인 기능 추가됨$$$$$$$$$$$");
	}

	public void logout() {
		System.out.println("$$$$$$$$$$$로그아웃 기능 추가됨$$$$$$$$$$$");
	}
}
