package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
//		1. 두 수를 입력받아서
		//ctrl + alt + 화살표아래: 한 줄복사
		//alt + 화살표방향: 이동
		String n1 = JOptionPane.showInputDialog("숫자1");
		String n2 = JOptionPane.showInputDialog("숫자2");
//		2. int로 변환한 후,
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
//		3. 더한 다음
		//+연산자: cpu
		int nn3 = nn1 + nn2;
		
//		4. 더한 결과값 출력
		System.out.println("더한 값은 " + nn3);
	}

}
