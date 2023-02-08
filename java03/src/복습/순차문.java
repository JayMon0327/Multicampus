package 복습;
//JOptionPane 이라는 폴더가 javax 밑에 swing 이라는 폴더 안에 있다 라고 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 두 개의 숫자를 입력을 받아서 처리해서 출력
		// 프로그래밍은 손으로 치는 값은 모두 다 스트링으로 취급(문자열)
		// 램에 저장공간을 만드는 것 (선언)
		// 선언할 때 램에 저장공간인 변수 가 만들어진다.
		// 데이터의 타입 변수명
		// 입력!! 
		String n1 = JOptionPane.showInputDialog("정수-1");
		String n2 = JOptionPane.showInputDialog("정수-2");
		
		// 처리!!
		// 정수로 바꾸어서 처리를 하고 싶으면, 프로그래머가
		// 정수로 바꾸어 주는 부품을 써서 처리를 해야한다.
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		// 출력
		// 자바언어는 정수와 정수의 연산의 결과는 무조건 정수!!!
		// 자바언어는 하나라도 실수이면 결과는 무조건 실수 !!!
		// 위에 두개를 double 형으로 바꾸는거 보다는 강제 형변환 시켜버림
		// 소수점 자리 처리하기 위해서는 printf 에 앞에 "%.원하는 소수점", 
		System.out.printf("%.2",(double)n11 / n22 );
		
	}

}
