package 생성자;

import java.sql.Time;

public class Day사용 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",10,"강남"); // 4개
		System.out.println(Day.count+ "개 생성됨");
		System.out.println(Day.sum+ "개 생성됨");
		//static이 붙은 메서드나 변수는 객체생성하지 않아도
		//클래스이름으로 바로 접근해서 사용가능!!
		Day day2 = new Day("여행",15,"강원도");
		System.out.println(Day.count + "개 생성됨");
		System.out.println(Day.sum+ "개 생성됨");
		Day day3 = new Day("운동",11,"피트니스");
		System.out.println(Day.count + "개 생성됨");		//총 12개의 변수 다이나믹 생성 --> 객체생성할 때마다 다이나믹 하게 무더기 영역(heap)에 생긴 변수
		System.out.println(Day.sum+ "개 생성됨");
		//인스턴스라고 부른다.

	}

}
