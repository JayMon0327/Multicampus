package 조건문;
import java.util.Date;
public class if문5 {

	public static void main(String[] args) {
//		**Date 를 이용하세요!
//		1) 현재 년도를 구해서 , 2000년 이상이면 밀레니엄 세대시군요.
//		아니면, 밀레니엄 세대가 아니시군요.
//		2) 요일을 구해서 토,일은 쉬 ~~~~~자 프린트
//			나머지 요일은 열~심히 공부하자 프린트
//		3) 달을 구해서 2월은 28일까지 프린트
//			4,6,9,11월은 30일까지
//			나머지는 31일까지 프린트
		
		Date name = new Date();
		Date date = new Date();
		
		int year = date.getYear() + 1900;
		
		if (year >=2000) {
			System.out.println("밀레니엄 세대 시군요");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
	
		int day = date.getDay();
		
		switch (day) {
		case 0:  case 6:
			System.out.println("쉬~~~~~~~~~자");
			
			break;
		case 1:  case 2:  case 3: case 4: case 5:
			System.out.println("열~심히 공부하자");
			
			break;
		default:
			break;
			
			
		}
		int month = date.getMonth() + 1;
		if (month == 2) {
			System.out.println("28일까지");
		} else if (month == 4 || month ==6 || month ==9 ||month ==11) {
			System.out.println("30일까지");
		}else{
			System.out.println("31일까지");
		}
		{

		}
	}
	
}


