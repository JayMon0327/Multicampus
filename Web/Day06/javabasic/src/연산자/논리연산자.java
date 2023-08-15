package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리적으로 판단을 하고 싶은데, 조건이 2개 이상이여서
		// 어떻게 판단해야 할지 모르는 경우 사용
		int id = 1111;
		int id2 = 2222;
		int pw = 3333;
		int pw2 = 3333;
		System.out.println(id == id2); //false
		System.out.println(pw == pw2); //true
		// &&, and 조건, 두 조건이 모두 맞아야 맞다라고 판단
		// 로그인 처리 !! 
		System.out.println(id == id2 && pw == pw2);
		
		int mem1 = 111; // 대입 연산자, 할당 연산자
		int mem2 = 222;
		
		//||, or 조건, 두 조건중 하나만 맞아도 맞다라고 판단
		System.out.println(mem1 == 111 || mem2 == 222);
		
		

	}

}
