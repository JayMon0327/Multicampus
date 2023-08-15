package 조건문;

import java.util.Scanner;

public class 콘솔연습3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력>>");
		int age1 = sc.nextInt();
		System.out.print("키를입력>>");
		double age2 = sc.nextDouble();
		System.out.print("저녁을 먹었는지 입력 (true/false)>>");
		boolean age3 = sc.nextBoolean();
		System.out.print("올해의 목표는 >>");
		sc.nextLine();
		String age4 = sc.nextLine();
		
		System.out.println("----------------------------");
		System.out.println("내년 나이는 "+(age1+10)+"세");
		System.out.println("당신의 키는 "+ age2);
		if (age3) {
			System.out.println("배가부르시겟군요");
		}else {
			System.out.println("배가고프시겠군요");
		}
		
		System.out.println("올해의 목표는 " + age4);
		
		
		sc.close();
		

	}

}
