package 연산자;


import javax.swing.JOptionPane;

public class 입력2개3 {

	public static void main(String[] args) {
		//1. 데이터: 입력
		String n1 = JOptionPane.showInputDialog("반복할 숫자");
		String n2 = JOptionPane.showInputDialog("반복할 문자");
		
		//2. 처리
		int nn1 = Integer.parseInt(n1);//5
		
		//3. 결과: 출력
		for (int i = 0; i < nn1; i++) {
			System.out.print(n2);
		}
	}

}
