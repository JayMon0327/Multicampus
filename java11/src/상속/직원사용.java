package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동"; //public
		//work.address = "강남구"; // protected
		
		//work.salary = 100; // default
		//->다른패키지인 경우 상속관계에서만 됨.!
		//work.rrn = 111;

	}

}
