package 제어문;

import java.util.Date;
import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		// 1)아이유 2)방탄 3) 뉴진스 4) 종료 >>1
		// 1)아이유 2)방탄 3) 뉴진스 4) 종료 >>2
		// 1)아이유 2)방탄 3) 뉴진스 4) 종료 >>4
		// 시스템을 종료합니다.
		
//		---------------------------
//		아이유 1표
//		방탄 2표
//		뉴진스 0표
//		----------------------------

		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		// 누적 시키는 변수는 반복문 안에 넣지 않는다. 
		// Scanner 같은 경우도 반복문 안에 넣지 않는다.
		// 종료값 체크해주는 코드 위치는 반복문 첫번째에 두고 하는것이 시스템을 빠르게 한다
		while (true) {
			System.out.println("인기투표 시스템\n==================================");
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>");
			data = sc.nextInt();
			
			if (data == 4) {
			//종료문
				System.out.println("시스템을 종료합니다");
				System.out.println("-------------------------------");
				System.out.println("아이유 "+ count1+ "표");
				System.out.println("방탄"+ count2 +"표" );
				System.out.println("뉴진스"+ count3+"표");
				
				break;
				
			}else if (data == 1) {
				count1++;
				
			}else if (data == 2) {
				count2++;
				
			}else if (data == 3) {
				count3++;
			}
			{
				
			}{
				
			} sc.close();
			
		}
		
	}

}
