package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.jdbc.proxy.annotation.GetCreator;
import 자바DB연결.BBSDAO;

public class BBSUI_IDPW {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setTitle("나의 회원가입 화면");
		f.setSize(500,950);
	
		
		Font font = new Font("궁서",Font.BOLD,45);
		
		JLabel l1 = new JLabel("<<<<<<나의 게시판>>>>>>");
		JLabel l6 = new JLabel("-----------------------");
		JLabel l2 = new JLabel("게시판 id");
		JLabel l3 = new JLabel("게시판 제목");
		JLabel l4 = new JLabel("게시판 내용");
		JLabel l5 = new JLabel("게시판 작성자");
		
		JTextField f1 = new JTextField(10);
		JTextField f2 = new JTextField(10);
		JTextField f3 = new JTextField(10);
		JTextField f4 = new JTextField(10);
		
		JButton b1 = new JButton("게시문 작성완료");
		JButton b2 = new JButton("게시물 삭제완료");
		JButton b3 = new JButton("게시물 수정완료");		
		JButton b4 = new JButton("게시물 검색완료");
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String no = f1.getText();
				BBSDAO dao = new BBSDAO();
				BbsVO bag = dao.one(1);
				if (bag !=null) {
					f2.setText(bag.getTitle());
					f3.setText(bag.getContent());
					f4.setText(bag.getWriter());
					
				}else {
					JOptionPane.showConfirmDialog(f, "검색결과없음");
					f2.setText("");
					f3.setText("");
					f4.setText("");
				}
				
				
				
			}
		});//b4 select
		
		
		f1.setBackground(Color.cyan);
		f2.setBackground(Color.cyan);
		f3.setBackground(Color.cyan);
		f4.setBackground(Color.cyan);
		f1.setForeground(Color.green);
		f2.setForeground(Color.green);
		f3.setForeground(Color.green);
		f4.setForeground(Color.red);
		b1.setBackground(Color.red);
		b2.setBackground(Color.red);
		b3.setBackground(Color.red);
		b4.setBackground(Color.red);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.blue);
		b4.setForeground(Color.blue);
		
		f.getContentPane().setBackground(Color.yellow);
		
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		l6.setFont(font);
		
		f1.setFont(font);
		f2.setFont(font);
		f3.setFont(font);
		f4.setFont(font);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(l1);
		f.add(l6);
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
