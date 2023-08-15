import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test {

	public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(200, 100);
	
	FlowLayout flow = new FlowLayout();
	f.setLayout(flow);
	
	JButton b1 = new JButton();
	b1.setText("나는버튼");
	JButton b2 = new JButton();
	b2.setText("나는버튼");
	
	JLabel text1 = new JLabel();
	text1.setText("아이디");
	JLabel text2 = new JLabel();
	text2.setText("비밀번호");
	
	JTextField input1 = new JTextField(10);
	JTextField input2 = new JTextField(10);
	
	Font font = new Font("궁서", 1, 20);
	text1.setFont(font);
	text2.setFont(font);
	b1.setFont(font);
	b2.setFont(font);
	input1.setFont(font);
	input2.setFont(font);
	
	text1.setBackground(Color.red);
	text1.setForeground(Color.white);
	text2.setBackground(Color.red);
	text2.setForeground(Color.white);
	b1.setBackground(Color.red);
	b1.setForeground(Color.white);
	b2.setBackground(Color.red);
	b2.setForeground(Color.white);
	input1.setBackground(Color.red);
	input2.setBackground(Color.red);
	
	
	
	
	
	
	
	ImageIcon icon1 = new ImageIcon("010.png");
	ImageIcon icon2 = new ImageIcon("no.png");
	
	b1.setIcon(icon1);
	b2.setIcon(icon2);
	
	f.add(text1);
	f.add(input1);
	f.add(b1);
	f.add(text2);
	f.add(input2);
	f.add(b2);
	
	f.setVisible(true);
	
	
	
	
	
	}

}
