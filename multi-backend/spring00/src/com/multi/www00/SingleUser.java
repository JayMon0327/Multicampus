package com.multi.www00;

public class SingleUser {

	public static void main(String[] args) {
		//SingleObject(프로토타입, 틀, 원형) -> s1, s2, s3*
		//프로토타입
		SingleObject s1 = new SingleObject();
		System.out.println(s1);
		SingleObject s2 = new SingleObject();
		System.out.println(s2);
		s1.play();
		for (int i = 0; i < 1000; i++) {
			SingleObject s3 = new SingleObject();
		}
		System.out.println(SingleObject.count);
		System.out.println("사용한 ram의 크기>> " + SingleObject.count * 4);
		

	}

}
