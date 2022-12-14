package error;

public class 예외처리Main {

	public static void main(String[] args) {
		//에러가 있는 클래스의 객체를 생성하고, 메서드를 호출해보자.
		에러발생2 error = new 에러발생2();
		error.call(); //실행 에러가 있는 메서드(***에러발생***)
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
	}

}
