package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기실습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330,460);
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b = new JButton();
		
		
		
		
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		text1.setText("아이디");
		text2.setText("패스워드");
		JLabel text3 = new JLabel();
		text3.setText("로그인확인");
		
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		b.setBackground(Color.green);
		b.setForeground(Color.white);
		
		text1.setBackground(Color.white);
		text1.setForeground(Color.green);
		text2.setBackground(Color.white);
		text2.setForeground(Color.green);
		
		
		
		
		
		
		Font fon = new Font("궁서", 1, 20);
		f.setFont(fon);
		b.setFont(fon);
	
		text1.setFont(fon);
		text2.setFont(fon);
		
		
		
		ImageIcon icon1 = new ImageIcon("1.png");
		
		
		b.setIcon(icon1);
		
		
		
		
		
		
		
		f.add(text1);
		f.add(input1);
		f.add(text2);
		f.add(input2);
		f.add(b);
		f.add(text3);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String id = input1.getText(); 
				String pw = input2.getText(); 
				if (id.equals("root") && pw.equals("1234")) {
//					JOptionPane.showMessageDialog(a, "로그인성공");
					text3.setText("로그인성공!");
					ImageIcon icon2 = new ImageIcon("surek.jpg");
					text3.setIcon(icon2);
				}else {
//					JOptionPane.showMessageDialog(a, "로그인실패");
					text3.setText("로그인실패!");
					input1.setText("");
					input2.setText("");
				}
				
			}
		});
		
		
		f.setVisible(true);
		

	}

}
