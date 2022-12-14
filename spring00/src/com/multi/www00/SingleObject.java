package com.multi.www00;

public class SingleObject {

	//객체를 여러개만들어서 주소가 어떻게 되는지 비교해볼 예정.
	static int count; //쓰레기값? 0?
	//클래스 바로 아래 만들어진 변수
	//변수는 만들어진 위치에 따라서 사용할 수 있는 범위가 결정.
	//클래스 바로 아래 만들어진 변수는 클래스 전체 영역에서 사용될 수 있음.
	//전역변수(global,글로벌) --> 자동초기화를 해줌.0으로 초기화!

	//new를 사용해서 객체생성할 때 자동으로 실행하고 싶은 부분을 넣어주는 메서드
	//객체생성할 때마다 자동호출되는 메서드 --> 생성자(메서드)
	public SingleObject() {
		System.out.println("객체 하나 생성됨!!!!");
		count++;
	}
	public void play() {
		System.out.println("놀자");
	}
}
