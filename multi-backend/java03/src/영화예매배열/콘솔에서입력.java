package 영화예매배열;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// 콘솔에서 입력: Scanner
		// 모든 입력의 데이터 타입은 String!!
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력>> ");
		String x = scan.next();//단어입력
		System.out.println("이름: " + x);
		System.out.print("나이를 입력>> ");
		int y = scan.nextInt();//int<-String입력
		System.out.println("내년 나이는 " + (y + 1) + "년");
		
		//현재키입력: 150.5
		//내년키는 170.5
		System.out.print("현재키입력>> ");
		double height = scan.nextDouble();
		System.out.println("내년 키는 " + (height + 20));
		
		//밖에 비가 오나: true
		//true이면, 우산을 가지고 가자
		//false이면, 우산을 놓고 가자
		System.out.print("밖에 비가 오나>> ");
		boolean rain = scan.nextBoolean();
		if (rain) {///true
			System.out.println("우산을 가지고 가자");
		}else {//false
			System.out.println("우산을 놓고 가자");
		}
		System.out.print("당신의 목표는>> ");
		scan.nextLine();
		String life = scan.nextLine();//엔터치기까지의 문장
		System.out.println("목표는 " + life);
	}
}










