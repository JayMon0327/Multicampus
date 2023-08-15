package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호생성중복제거 {

	public static void main(String[] args) {
		Random	r = new Random();
		HashSet lotto = new HashSet();
		for (int i = 0; i < 6; i++) {
			int num = r.nextInt(45) + 1;//1~45
			System.out.println(num);
			if(lotto.contains(num)) {
				i--;
			}else {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
		
//		while (lotto.size() < 6) {
//			lotto.add(r.nextInt(45) + 1);//1~45
//		}
//		System.out.println(lotto);
	}

}
