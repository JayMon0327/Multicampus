package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 내용돈계산해보자 {

	public static void main(String[] args) {
//		용돈계산기.java
//		=> add(), mul()
//
//		내용돈을계산해보자.java
//		기간 6개월, 한달 용돈 100000 => mul()
//		전체 금액이 50만원이 안되면, 15만원을 더 주고,
//		전체 금액이 50만원이 넘으면, 그냥 50만원만 줌.
//
//		=>add()
//		상반기 받은 용돈 금액 60만원
//		하반기 받은 용돈 금액 50만원
//		일년 동안 받은 용돈을 출력해보세요.
		
		int 기간 = 6;
		int 한달 = 100000;
		
		용돈계산기 용돈 = new 용돈계산기();
		int result = 용돈.mul(기간, 한달);
		if (result >= 500000) {
			System.out.println("용돈은 "  + result + "원");
		} else {
			System.out.println("용돈은 "  + (result + 150000)+ "원");
		}
		
		int pre = 600000;
		int post = 500000;
		용돈.add(pre, post);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
