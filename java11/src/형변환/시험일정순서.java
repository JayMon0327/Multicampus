package 형변환;

import java.util.LinkedList;

public class 시험일정순서 {

	public static void main(String[] args) {
		LinkedList object = new LinkedList();
		object.add("국어");
		object.add("수학");
		object.add("영어");
		object.add("컴퓨터");
		object.remove();
		System.out.println("1일차 시험본 후 남은 과목: "+ object);
		object.remove();
		System.out.println("2일차 시험본 후 남은 과목: "+ object);
		object.remove();
		System.out.println("2일차 시험본 후 남은 과목: "+ object);

	}

}
