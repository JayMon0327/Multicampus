package 배열;

import java.util.Random;

public class 랜덤하게배열에값넣기 {

	public static void main(String[] args) {
		Random r = new Random(100);
		//정수 +-21 --> 0~100
		
		int[] numbers = new int[1000];
		//number = {0,0,0,0,0,0,0,0,,,,} 
		//배열은 만들때 초기화를 자동으로 시켜준다.
		for (int i = 0; i < numbers.length; i++) {
		numbers[i] = r.nextInt(101);
		//정수 +-21 --> 0~100
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + ": "+numbers[i]);
		}
	}

}
