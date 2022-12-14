package com.multi.mvc03;

import org.springframework.stereotype.Component;

@Component
public class ASite implements ASiteInterface {

	@Override
	public void person() {
		System.out.println("---------개인정보보기 기능 호출됨-------");
	}
}
