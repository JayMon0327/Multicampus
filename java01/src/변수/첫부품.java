package 변수;

import javax.swing.JOptionPane;

public class 첫부품 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름입력");
		System.out.println("당신의 이름은 " + name + "이시군요!!");
		
		JOptionPane.showMessageDialog(null, "당신의 이름은 " + name + "이시군요!");

	}

}
