package 조건문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	System.out.println("나에 대한 정보");
	System.out.println("-----------------");
	System.out.print("이름 입력 >>");
	String data1 = sc.next();
	
	System.out.print("나이 입력 >>");
	int data2 = sc.nextInt();
	
	System.out.print("취미 입력 >>");
	String data3 = sc.next();
	
	
	
		
	System.out.println("나의 이름은 "+data1+"입니다");	
	System.out.println("나의 나이는 "+data2+"입니다");	
	System.out.println("나의 번호는 "+data3+"입니다");	
		
		

	}

}
