package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 반복문연습문제2 {

	public static void main(String[] args) {
	//1. 
		for (int i = 0; i < 10; i++) {
			System.out.println("*");
			
			
			
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
			
			
		}
		System.out.println();
		//3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}
		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) +": 짱"); // 앞에서 부터 계산 할때는 괄호 처리 안해도됨. 알죠 ? 앞에 문자부터 계산
												// 하지만 명확하기 위해서 괄호처리 합시다 !
			
		}
	}

}
