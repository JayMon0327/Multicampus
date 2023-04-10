package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제기본2 {

	public static void main(String[] args) {
		Random r = new Random(5);
		int[] n = new int[20];
		for (int i = 0; i < n.length; i++) {
			n[i] =r.nextInt(900); //0~899
		}
		Arrays.sort(n); //으롬차순 1,2,3....
		
		System.out.println(n[19]);
		

	}

}
