package 제어문;

import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		Random r1 = new Random();
		int target = r1.nextInt(100);
		// 코드는 1번 한번 일단 돌려봐라 2번 디테일을 살린다
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int count = 0;
	
		// 종료값 체크해주는 코드 위치는 반복문 첫번째에 두고 하는것이 시스템을 빠르게 한다
		while (true) {
			System.out.println("생각한 정답은??");
			data = sc.nextInt();
			count++;			
			if (data == target) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다");
				System.out.println("당신의 시도 횟수는 " + data + "입니다");
				
				break;
			} else {
				System.out.println("오답입니다.");
				System.out.println("다시 시도해주세요.");
				if (data > target) {
					System.out.println("너무 커요");
				}else if(data < target) {
					System.out.println("너무 작아요");
				}
			} 
		} sc.close();
		

	}

}
