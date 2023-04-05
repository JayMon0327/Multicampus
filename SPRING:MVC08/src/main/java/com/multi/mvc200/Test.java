package com.multi.mvc200;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		System.out.println("주소비교: " + (s == s2));
		s = "김길동";
		System.out.println("주소비교: " + (s == s2));

		// String은 데이터가 변경되는 경우
		// 새로운 곳에 String을 저장할 변수를
		// 생성한다. 메모리 관리부분에서
		// 비효율적

		StringBuilder s3 = new StringBuilder();
		s3.append("김길동");
		System.out.println(s3);
		
		Stack<String> stack = new Stack<String>();
		stack.push("aaa");
		System.out.println(stack.push("bbb"));
		System.out.println(stack.size());
		
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("추가1");
		queue.add("추가2");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.element());
		//System.out.println(queue.poll());
		System.out.println(queue);
		//queue.remove();
		System.out.println(queue);
		System.out.println(queue.isEmpty());
		Iterator<String> list = queue.iterator();
		System.out.println(queue.get(0));
		for (String string : queue) {
			System.out.println(string);
		}
		if(list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
