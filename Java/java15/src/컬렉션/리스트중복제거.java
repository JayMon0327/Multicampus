package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트중복제거 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Random r = new Random();
		for (int i = 0; i < 3000; i++) {
			list.add(r.nextInt(5000));
		}
		HashSet set = new HashSet(list);
		System.out.println(set.size());
		
		ArrayList result = new ArrayList(set);
		System.out.println(result.size());
		
	}

}
