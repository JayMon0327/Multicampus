package 컬렉션;

import java.util.LinkedList;

public class 시험과목제거 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}
		System.out.println();
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}
		System.out.println();
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}
		System.out.println();
		test.remove();
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}
	}

}
