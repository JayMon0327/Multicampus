package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 숫자맞추기 {

	public static void main(String[] args) {
		// JFrame / JLable / FlowLayout / JTextField / JButton / Font / color 
		
		JFrame f = new JFrame();
		f.setSize(500, 200);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요");
		JTextField text = new JTextField(20);
		
		JButton b = new JButton();
		b.setText("숫자를 맞춰보자!");
		Font font1 = new Font("d2coding", 1 , 20);
		Font font2 = new Font("d2coding", 1 , 30);
		
		l.setFont(font1);
		text.setFont(font1);
		b.setFont(font2);
		
		
		text.setForeground(Color.blue);
		text.setBackground(Color.pink);
		b.setBackground(Color.yellow);
		
		
		f.add(l);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);
	}

}
