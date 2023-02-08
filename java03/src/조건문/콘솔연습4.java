package 조건문;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 콘솔연습4 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(350, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label1 = new JLabel();
		label1.setText("아이디");
		JLabel label2 = new JLabel();
		label2.setText("비밀번호");
		
		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);
		
		f.add(label1);
		f.add(text1);
		f.add(label2);
		f.add(text2);
		
		
		
		f.setVisible(true);
		

	}

}
