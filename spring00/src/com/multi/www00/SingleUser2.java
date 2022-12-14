package com.multi.www00;

public class SingleUser2 {

	public static void main(String[] args) {
		SingleObject2 s1 = SingleObject2.getInstance();
		System.out.println(s1);
		System.out.println(SingleObject2.count);
		
		SingleObject2 s2 = SingleObject2.getInstance();
		System.out.println(s2);
		System.out.println(SingleObject2.count);
		s2.play();
		s1.play();

	}

}
