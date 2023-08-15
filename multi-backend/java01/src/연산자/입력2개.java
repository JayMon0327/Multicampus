package 연산자;

import javax.swing.JOptionPane;

public class 입력2개 {

	public static void main(String[] args) {
		//1. 데이터: 입력
		String n1 = JOptionPane.showInputDialog("숫자1");
		String n2 = JOptionPane.showInputDialog("숫자2");
		
		//2. 처리
		int nn1 = Integer.parseInt(n1);
		int nn2 = Integer.parseInt(n2);
		
		//3. 결과: 출력
		System.out.println(nn1 + nn2);
		System.out.println(nn1 - nn2);
		System.out.println(nn1 * nn2);
		System.out.println(nn1 / nn2);
	}

}
