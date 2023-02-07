package 순차문;

import javax.swing.JOptionPane;

//부품이 있는 위치를 알려주는 역할


public class 순차문3 {

	public static void main(String[] args) {
		//입력
		String cm = JOptionPane.showInputDialog("당신의 키는?");
		String kg = JOptionPane.showInputDialog("당신의 몸무게는?");
		
		//처리
		double cm1 = Double.parseDouble(cm); 
		double kg1 = Double.parseDouble(kg); 
		
		double result = ((cm1 - kg1)*0.9);
		
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	}

}
