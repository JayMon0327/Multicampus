package 배열;

import java.util.Scanner;

public class 정리문제기본 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] =sc.nextInt();
		}
		int min =n[0];
		for (int x : n) {
			if (x<min) {
				min = x;
			}
		}
		System.out.println(min);
		
		sc.close();

	}

}
