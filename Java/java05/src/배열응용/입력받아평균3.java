package 배열응용;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.xml.crypto.Data;

public class 입력받아평균3 {

	public static void main(String[] args) {
	// 1. 정수 5개 크기의 배열을 만들어서 
//		1. 10,20,30,40,50 을 순서대로 넣는다.
	
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println("정수입력");
			jumsu[i] = sc.nextInt();		
			}
		

		
		//첫번째 값과 세번째 값을 더해서 프린트
		System.out.println(jumsu[0]+jumsu[2]);
		
			
			 
		
		
//		2. 스트링 3개 크기의 배열을 만들어서
//		자바, 스프링, JSp를 순서대로 넣는다.
		String[] st = new String[3];
		
//		->"자바 보다는 스프링"로 출력
		
		
		
		
	}

}
