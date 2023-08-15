package 클래스사용하기;

import 클래스만들기.컴퓨터;

public class 컴퓨터공장2 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터();
		com1.price = 100;
		com1.company = "APPLE";
		com1.size = 30;
		System.out.println(com1);
		
		컴퓨터 com2 = new 컴퓨터();
		com2.price = 200;
		com2.company = "BANANA";
		com2.size = 20;
		System.out.println(com2);
	}

}
