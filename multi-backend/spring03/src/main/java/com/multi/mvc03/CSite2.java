package com.multi.mvc03;

import org.springframework.stereotype.Component;

@Component("cSite2")
public class CSite2 implements CSiteInterface {

	@Override
	public void orderView() {
		System.out.println("주문정보를 모바일로 보다.");
	}

	@Override
	public void confirm() {
		System.out.println("주문정보를 모바일로 확인하다.");
	}

}
