package 문자열;

import java.util.Arrays;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234"; //false
//		String s = "1234"; //true
		boolean answer = true;
		
		//0. 4글자, 6글자 인지 판단해서 맞으면
		// 아래를 실행해주자.
		//글자 수를 구해주자.
		int size = s.length();
		
		//1. 글자 하나씩 떨어뜨려라.
		// for문 돌려서 하나씩 꺼낸 다음
		// 글자 하나하나가 0~9 사이이면 됨.
		if(size == 4 || size ==6){
		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c));
		for (char x : c) {
			if (x < '0' || x >'9') { //문자가하나라도 있으면 false하고 중지한다.
				answer = false;
				break;
			}
		}
		}else {
			answer = true;
		}
		System.out.println(answer);
		
		
		//2. 숫자로 바꾸어서 에러가 생기면
		// 문자가 포함되어 있음.
		if(size == 4 || size ==6){
			try {
				//String을 int로 바꾸어서 error가 생기는지 확인
				//--> error가 생겼으면 문자가 포함되어서 
				//int로 바꿀 수 없다라는 의미
				Integer.parseInt(s);
			} catch (NumberFormatException e) {
				// 에러처리할 내용.
				//숫자로만 이루어지지 않았음을 
				//answer에 넣자.
				answer = false;
			}
			
			//에러가 발생했을 때 프로그램이 중단되고,
			//에러메세지를 프린트
			//에러가 발생했을 때 
			//에러 상황을 캐치해서 
			//내가 임의로 처리한 후,
			//프로그램을 중단하지 않고,
			//계속 실행하고 싶음.
			//--> try catch
		}else {
			answer = false;
		}
			System.out.println(answer);
				

	}

}
