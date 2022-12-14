package com.multi.www00;

public class SingleObject2 {

	static int count; //0
	static SingleObject2 object; //null
	
	//static메서드는 객체생성되기 전에 호출가능함.
	//세탁기 만들어지기 전에 세탁기가 만들어졌는지 안만들어졌는지 확인하는 메서드
	public static SingleObject2 getInstance() {
		if(object == null) { //세탁기 있는 장소가 null이면, 아직 세탁기를 만들지 않음.
			object = new SingleObject2();
		}
		return object;
	}
	
	//싱글톤으로 만들어서 사용할 클래스는 외부에서 만들지 못하도록 생성자의 
	//접근을 막아버리면 됨.
	private SingleObject2() { //private접근제어자는 클래스안에서만 접근 가능
		//이 클래스밖에서는 안보임.
		System.out.println("객체 하나 생성됨!!!!");
		count++;
	}
	
	public void play() {
		System.out.println("놀자");
	}
}
