package 배열응용;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] number = new int[1000];
		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(1000)-444;// 0~999
			
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ": " + number[i]);
		}
		int target = 100;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] == target) {
				System.out.println(target + "의 위치는 " + i);
				count++;// 증감연산자
			}
		}
		System.out.println(target + "의 개수는 " + count + "개");
	}

}
