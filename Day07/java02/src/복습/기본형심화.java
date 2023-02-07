package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		//기본형 4가지
		// 정수, 실수 , 문자1, 논리
		//int double char boolean
		//온도
		double temp = 1.2; //세미콜론
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String location = "선릉역";

		
		//sysout 컨트롤+스페이스바
		//망치처럼 자주 사용하는 부품은 대문자로 바로 씁니다.
		//system - 컴퓨터, out(출력장치) - 모니터
		// 				  in(입력장치) - 키보드
		System.out.println("오늘 온도는 " + temp + "도");
		
		System.out.println("오늘의 컬러는 " + color + "가 좋겠어");
		System.out.println("난 오늘 주스를 먹어성"+ juice);
		System.out.println("오늘 " + location +" 에서 만나기로 햇어");
	}

}
