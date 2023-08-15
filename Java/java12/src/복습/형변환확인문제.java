package 복습;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1000);
		list.add(189.1);
		list.add(false);
		list.add('남');
		System.out.println(list);
		
		int money = (Integer)list.get(0); // Object <- 업캐스팅 -  Integer <- 오토박싱- int
		System.out.println(money+2000);
		
		double height = (Double)list.get(1); //Object <- Double <- double
		System.out.println(height+10);
		
		boolean morning = (boolean)list.get(2); //Object <- Boolean <- boolean
		if (morning) { // boolean 값이면 == 연산자 기호 안써도 기본적으로 값이 들어있기 때문에 안써도 됨
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		char sex = (Character)list.get(3); //Object <- character <-char
		if (sex == '남') {
			System.out.println("주민번호는 1,3 이에요");
		}else {
			System.out.println("주민번호는 2,4 이에요");
		}
		//ArrayList는 toString()가 재정의
		//list는 참조형이기 때문에 list를 프린트하면 주소!가 프린트
		//toString()이 재정의한 내용은 주소가 가르키는 값들을 String으로 만들어주도록 정의함.
		//list를 찍어보면 주소대신 String으로 만든 내용이 출력
		
		
		
		
		

	}

}
