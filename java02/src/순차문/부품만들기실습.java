package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기실습 {

	public static void main(String[] args) {
		JFrame a = new JFrame();
		a.setSize(500,150);
		
		
		FlowLayout f = new FlowLayout();
		a.setLayout(f);
		
		JButton b = new JButton();
		b.setText("아이디 확인");
		JButton b1 = new JButton();
		b1.setText("비번확인");
		
		
		JLabel name = new JLabel();
		JLabel word = new JLabel();
		name.setText("아이디");
		word.setText("패스워드");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		name.setBackground(Color.red);
		name.setForeground(Color.white);
		word.setBackground(Color.red);
		word.setForeground(Color.white);
		
		
		
		
		
		
		Font fon = new Font("궁서", 1, 20);
		a.setFont(fon);
		b.setFont(fon);
		b1.setFont(fon);
		name.setFont(fon);
		word.setFont(fon);
		
		
		ImageIcon icon1 = new ImageIcon("2.png");
		ImageIcon icon2 = new ImageIcon("2.png");
		
		b.setIcon(icon1);
		b1.setIcon(icon2);
		
		
		
		
		
		
		a.add(input2);
		a.add(input1);
		a.add(name);
		a.add(b);
		a.add(word);
		a.add(b1);
		
		a.setVisible(true);
		

	}

}
