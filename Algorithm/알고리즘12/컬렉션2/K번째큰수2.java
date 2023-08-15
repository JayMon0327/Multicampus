package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;

public class K번째큰수2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); //입력할 개수, 5 
		int k = sc.nextInt(); //k번째 큰수
		int[] num = new int[size]; //{0,0,0,0,0} <- 3, 4, 5, 1, 2
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num); //원본을 정렬해서 다시 저장 
		System.out.println(Arrays.toString(num));
		System.out.println(k +"번째 큰수: " + num[num.length -k]);
	}

}
