package 조건문;

import java.util.IllegalFormatCodePointException;

public class case문 {

	public static void main(String[] args) {
		// 조건이 여러개 일때
		//점수가 80점 이상이면 최우수
		//점수가 70점 이상이면 우수
		//점수가 60점 이상이면 보통
		//나머지는 미달
		//if문은 조건이 맞아서 실행하고 나서 끝남.!!
		int myNum = 99;
		
		if (myNum >= 80) {
			System.out.println("최우수");
			
		}else if (myNum >= 70) {
			System.out.println("우수");
		}else if(myNum >= 60) {
			System.out.println("보통");
		}else {
			System.out.println("미달");
		}
		
		
		int myTour = 10; //올해 여행 횟수
		//여행 횟수가 10이면 "VVIP" 프린트
		//여행 횟수가 6이면 "VIP" 프린트
		//나머지 횟수이면, "Normal" 프린트
		// switch 문은 수동으로 break 꼭 해야한다. 안하면 계속해서 진행됨
		switch (myTour) { 
		case 10:
			System.out.println("VVIP");
			break;

		case 6:
			System.out.println("VIP");
			break;
			default:
				System.out.println("norMal");
		}
			
		
	}

}
