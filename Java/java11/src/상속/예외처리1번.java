package 상속;

public class 예외처리1번 {

	public static void main(String[] args) {
		// 실행할 때 에러가 발생해서 프로그램이 멈추는 것을 막기 위한 것.
		System.out.println("1.나는 프린트 될거야.");
		
		try { 
			//문제가 발생할 것은 코드를 넣어주는 부분
			System.out.println("2. 문제 발생 코드 >> " + 10 / 0);
		} catch (Exception e) {
			//예외사항이 발생하면, 잡아서 어떻게 처리하 지 코드를 넣어주는 부분
			System.out.println("에러 발생함.");
			System.out.println(e.getMessage());
		}
		System.out.println("3.나는 과연 프린트될까요????");
		

	}

}
