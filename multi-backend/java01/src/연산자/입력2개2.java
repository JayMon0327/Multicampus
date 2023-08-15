package 연산자;

import javax.swing.JOptionPane;

public class 입력2개2 {

	public static void main(String[] args) {
		//1. 데이터: 입력
		String n1 = JOptionPane.showInputDialog("시작값");
		String n2 = JOptionPane.showInputDialog("종료값");
		
		//2. 처리
		int nn1 = Integer.parseInt(n1);//5
		int nn2 = Integer.parseInt(n2);//1000
		
		//3. 결과: 출력
		for (int i = nn1; i <= nn2; i++) {
			System.out.println(i);
		}
	}

}
