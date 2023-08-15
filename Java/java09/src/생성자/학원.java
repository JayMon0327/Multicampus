package 생성자;

public class 학원 {

	public static void main(String[] args) {
		수강신청 sub1 = new 수강신청("자바", "홍길동", 11);
		수강신청 sub2 = new 수강신청("국어", "홍길동", 11);
		System.out.println(sub1);
		System.out.println(sub2);

	}

}
