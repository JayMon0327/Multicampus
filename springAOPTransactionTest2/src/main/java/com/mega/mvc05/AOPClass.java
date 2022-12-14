package com.mega.mvc05;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//관점 클래스(부가기능만 가지고 있는 클래스)
@Component("aop")
@Aspect
public class AOPClass {
	
	public void login() {
		System.out.println("로그인이 삽입됨+++++++++++");
	}
	
	public void logout() {
		System.out.println("로그아웃이 삽입됨+++++++++++");
		
	}

}
