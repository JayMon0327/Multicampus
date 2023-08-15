package 컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자이터레이터2 {

	public static void main(String[] args) {
		HashSet<Integer> bag = new HashSet<>();
		//일주일간 받았던 용돈
		//1000,2000,3000,2000,4000,2000,3000
		
		//일주일간 받았던 용돈 중에서
		//얼마씩 받았는지 전체 프린트 
		// 1000,2000,3000,4000
		bag.add(1000);
		bag.add(2000);
		bag.add(3000);
		bag.add(2000);
		bag.add(4000);
		bag.add(2000);
		bag.add(3000);
		System.out.println(bag);
		System.out.println(bag.size());
		Iterator<Integer> it = bag.iterator();
		System.out.println(it.hasNext());
		for (int i = 0; i < bag.size(); i++) {
			System.out.println(it.next());
		}
		Object[] list = bag.toArray();
		for (Object x : list) {
			System.out.println(x);
		}
		

	}

}
