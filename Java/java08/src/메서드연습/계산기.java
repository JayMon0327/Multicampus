package 메서드연습;

public class 계산기 {
	public void 더하기(int x, int y) { // 더하기(2,3) // 매개변수 parameter
		System.out.println("더하기 기능 처리 방법 내용");
		System.out.println(x + y);

	}
	public void 곱하기(int x, int y, int z) {
		System.out.println("곱하기 기능 처리 내용");
		System.out.println(x * y* z);
	}
	public int 빼기(int x, int y) { //매개변수 parameter
		System.out.println("빼기 기능 처리 방법 내용");
		return x - y; // int로 반환을 해야하는데 void를 쓰면 오류 
		
	}
}
