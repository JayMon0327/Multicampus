package com.multi.www.web02;

public class Car2 {
	String color; //주소(4바이트)
	int price; //4
	int speed; //4 
	//하나만 제공하는 객체는
	//static: 하나만 변수만들때 
	//public: 제공하는 car2를 아무데서나 쓸 수 있도록! 
	public static Car2 car2; 
	
	//밖에서 못불러다 쓰게 만들때는
	//private 으로 막아버린다.
	//싱글톤은 해당클래스에서 하나만 만들어서 제공!
	
	public static Car2 getInstance() { //getInstance를 만나면 싱글톤이라 생각!!
		//이미 만들지 않았다면 
		if (car2 == null) {//아직 안 만들어진 것 !!
			car2 = new Car2("빨강", 100, 110);	
		}
		return car2;
	}
	
	public void run() {
		System.out.println("달리자~~~~~~~~~~~~₩");
	}
	
	//new를 이용해서 객체생성시 new Car2()를 외부에서
	// 부를수 없도록 해당 클래스내에서만 부르게 하고 
	//싶은 경우는 접근제어자를 private으로 바꾸어버리자!!
	private Car2(String colorString, int price, int speed) {
		this.color = colorString;
		this.price = price;
		this.speed = speed;
	}


}
