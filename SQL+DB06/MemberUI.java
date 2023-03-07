package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JTextField;

import oracle.jdbc.proxy.annotation.GetCreator;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("나의 회원가입 화면");
		f.setSize(500,900);
	
		
		Font font = new Font("궁서",Font.BOLD,45);
		
		JLabel l1 = new JLabel("<<<<<<회원가입화면>>>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");
		
		JTextField f1 = new JTextField(10);
		JTextField f2 = new JTextField(10);
		JTextField f3 = new JTextField(10);
		JTextField f4 = new JTextField(10);
		
		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");
		
		f1.setBackground(Color.green);
		f2.setBackground(Color.green);
		f3.setBackground(Color.green);
		f4.setBackground(Color.green);
		f1.setForeground(Color.white);
		f2.setForeground(Color.white);
		f3.setForeground(Color.white);
		f4.setForeground(Color.red);
		b1.setBackground(Color.LIGHT_GRAY);
		b2.setBackground(Color.LIGHT_GRAY);
		b3.setBackground(Color.LIGHT_GRAY);
		b4.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(Color.red);
		b2.setForeground(Color.red);
		b3.setForeground(Color.red);
		b4.setForeground(Color.red);
		
		f.getContentPane().setBackground(Color.blue);
		
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		
		f1.setFont(font);
		f2.setFont(font);
		f3.setFont(font);
		f4.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1);
		f.add(l2);
		f.add(f1);
		f.add(l3);
		f.add(f2);
		f.add(l4);
		f.add(f3);
		f.add(l5);
		f.add(f4);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
		

	}

}
