package 조건문;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 콘솔연습5 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디입력 >> ");
//		String id = sc.next();
//		System.out.print("비밀번호입력 >> ");
//		String pw = sc.next();
//		
//		if (id.equals("root") && pw.equals("1234")) {
//			System.out.println("로그인성공!");
//			
//		}else {
//			System.out.println("로그인실패!");
//		}
//		
//		System.out.println("사과 개수입력>>");
//		int num1 = sc.nextInt();
//		System.out.println("사과 가격입력>>");
//		int apple1 = sc.nextInt();
//		System.out.println("딸기 개수 입력>>");
//		int num2 = sc.nextInt();
//		System.out.println("딸기 가격 입력>>");
//		int apple2 = sc.nextInt();
//		
//		int result1 = num1 * apple1;
//		int result2 = num2 * apple2;
//		int result3 = result1 + result2;
//		
//		
//		System.out.println("사과 구매 가격은 " + result1 + "입니다");
//		System.out.println("딸기 구매 가격은 "+ result2+ "입니다");
//		System.out.println("전체 구매 가격은 "+ result3+ "입니다");
		
//		
//		int sum = 0;
//		for (int i = 0; i < 100; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		int sum2 = 0;
//		for (int i = 0; i < 100; i++) {
//			if (condition) {
//				
//			}
//		}
//		System.out.println(sum);
		
		
		
		int sum2 = 0;
		for (int i = 0; i < 500; i++) {
			
			if (i / 2 != 0) {
				sum2 = sum2+i;
				
				continue;
				
			}else if (sum2 == 100 ) {
				System.exit(0);
			}System.out.println(sum2);{
				
			}
			
			
		}
		

	}

}
