package 조건문;

public class if문4 {

	public static void main(String[] args) {
		String ssn = "2055111"; // 주민번호 뒷자리
		//String 변수로 비교연산자를 사용하는 방법 .equals (같다는 뜻의 함수)
		if (ssn.equals("2055111")) {
			System.out.println("동일한 지역에서 태어나셨군요");
			
		} else {
			System.out.println("동일한 지역에서 태어난게 아니시군요");

		}
		char gender = ssn.charAt(0); // 첫번째 자리에 있는 문자 하나 추출 / 컴퓨터는 0부터 숫자를 세기 때문
		switch (gender) {
		case '1': case '3':
		
			System.out.println("남자");
			break;
		case '2': case '4':
		
			System.out.println("여자");
			break;
		}
		}
	
	}


