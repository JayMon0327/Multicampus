package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		int 가입id = 1111;
		int 가입pw = 2222;
		
		int 로그인id = 1111;
		int 로그인pw = 2000;
		if (가입id == 로그인id  && 가입pw == 로그인pw) {
			//and연산자, 여러 조건이 모두 true일 때, 
			//전체 논리적인 판단을 true라고 판단하는 경우
			System.out.println("로그인 ok");
		} else {
			System.out.println("로그인 not");
		}
	}
}







