package 생성자;

import 생성자.전화기;

public class 전화기사용하기 {
	public static void main(String[] args) {
		//전화기를 만들어보자 . 2개를 만들어보자.
		전화기 p1 = new 전화기();
		p1.price = 1000;
		p1.shape = "폴더";
		p1.인터넷하다();
		System.out.println("p1의가격: " + p1.price);
		System.out.println("p1의모양: " + p1.shape);
		전화기 p2 = new 전화기();
		p2.price = 2000;
		p2.shape = "네모";
		p2.카톡하다();
		System.out.println("p2의가격: " + p2.price);
		System.out.println("p2의모양: " + p2.shape);
		
	}
	
}
