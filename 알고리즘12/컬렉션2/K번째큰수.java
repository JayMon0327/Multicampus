package 컬렉션2;

import java.util.Arrays;

public class K번째큰수 {

	public static void main(String[] args) {
		int[] num = { 3, 4, 5, 1, 2, 8, 7, 6 };
		int k = 3; // 3번째 큰수
		// 일단 정렬해라!!
		// 정렬한 데이터 중에서 2번째 위치를 찾을 것.
		Arrays.sort(num); //원본을 정렬해서 다시 저장 
		for (int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();
		String num2 = Arrays.toString(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));
		
		//System.out.println("제일 큰수: " + num[4]);
		System.out.println("제일 큰수: " + num[num.length -1]);
		//첫번째 큰 수 num.length -1
		//두번째 큰 수 num.length -2
		System.out.println("두번째 큰수: " + num[num.length -2]);
		System.out.println("세번째 큰수: " + num[num.length -3]);
		System.out.println(k +"번째 큰수: " + num[num.length -k]);
	}

}
