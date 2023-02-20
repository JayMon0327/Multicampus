package 형변환;

import java.awt.List;
import java.util.ArrayList;

import javax.sound.sampled.LineListener;

public class 스키대회 {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add("박스키");
		alist.add("송스키"); // 1 
		alist.add("김스키");
		alist.add("정스키");
		System.out.println(alist);
		alist.remove(1);
		
		for (int i = 0; i < alist.size(); i++) {
			System.out.println((i+1)+"등:"+alist.get(i));
		}
		alist.add(1,"김볼링");
		System.out.println("시상자 목록"+alist);
		
		
		ArrayList alist2 = new ArrayList();
		alist2.add("이스키");
		alist2.add("박스키"); // 1 
		alist2.add("양스키");
		alist2.addAll(alist2); // 파괴형함수
		System.out.println(alist2);
		System.out.println(alist2.isEmpty());
		
	}

}
