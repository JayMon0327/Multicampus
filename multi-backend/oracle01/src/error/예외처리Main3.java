package error;

public class 예외처리Main3 {

	public static void main (String[] args){
		//에러가 있는 클래스의 객체를 생성하고, 메서드를 호출해보자.
		에러발생3 error = new 에러발생3();
		try {
			error.call();
		} catch (Exception e) { //Exception e = new Exception(); e.setMessage("에러발생내용");
			System.out.println("매니저 에러발생했다는 문자로 보내자!!로 처리");
			System.out.println(e.getMessage());
		} //실행 에러가 있는 메서드(***에러발생***)
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
		System.out.println("에러발생후 실행될까요?????!!!!");
	}

}
