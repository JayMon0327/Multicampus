package com.multi.www.web02;

public class Car {
	String color; //주소(4바이트)
	int price; //4
	int speed; //4 
	
	public Car(String colorString, int price, int speed) {
		this.color = colorString;
		this.price = price;
		this.speed = speed;
	}
	//멤버변수 
	//멤버메서드 
	//toString()
	//객체생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요!
	//-> 객체생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자 메서드 constructor

//	@Override
//	public String toString() {
//		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
//	}

}
