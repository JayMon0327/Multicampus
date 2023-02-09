package 제어문;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 --> Random
		Random r = new Random(10); // 씨앗값, seed값 /  값을 넣으면 한번 랜덤한게 고정됨
		for (int i = 0; i < 6; i++) {
			System.out.println("로또번호 : " + (r.nextInt(45)+1));
		}
		
		
		//2 ~ 10 
		Random r2 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호는 >> " + (r2.nextInt(9) + 2));
		}
		//3 ~ 30
		Random r3 = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println("내 로또 번호는 >> " + (r3.nextInt(28) + 3));
		}
		
	}

}
