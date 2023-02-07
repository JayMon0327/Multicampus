package 조건문;

import java.util.Date;


public class if문3 {

	public static void main(String[] args) {
		//Data - 년월일 시분초 , java.until
		Date name = new Date();
		Date date = new Date();
		
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		
		int hour = date.getHours();
//		int hour = 15;
		
		if (hour < 11) {
			System.out.println("Good Morning");
		}else if (hour < 14) {
			System.out.println("Good atfer noon");
		}else if (hour < 20) {
			System.out.println("Good evening");
		}else {
			System.err.println("Good night");
		}
		
		
		int month = date.getMonth() + 1;
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			break;
		}
	}

}
