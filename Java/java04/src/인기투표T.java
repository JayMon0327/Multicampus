import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표T {

	public static void main(String[] args) {
		// 1. 필요한 부품을 RAM에 가져다 놓자.
		// --> 벽돌처럼 !!
		// JFrame, FlowLayout2, Font2-3
		// JLabel 7, JButton 3
		// ImageIcon 3
		JFrame f = new JFrame();
		f.setSize(700,900);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font1 = new Font("궁서", 1 ,15);
		Font font2 = new Font("궁서", 1 ,20);
		
		JLabel l1 = new JLabel();
		l1.setText("k-pop 인기 투표");
		l1.setFont(font2);
		
		JLabel l2 = new JLabel();
		l2.setText("1. 아이유-라일락");
		l2.setFont(font1);
		
		JLabel l3 = new JLabel();
		l3.setFont(font1);
		l3.setText("2. 프로미스나인-we go");
		JLabel l4 = new JLabel();
		l4.setText("3. newjens");
		l4.setFont(font1);
		
		
		JLabel l5 = new JLabel(); // 아이유 투표수 프린트
		l5.setFont(font2);
		l5.setForeground(Color.red);
		JLabel l6 = new JLabel(); // 방탄소 프린트
		l6.setFont(font2);
		l6.setForeground(Color.red);
		JLabel l7 = new JLabel(); // 뉴진스 프린트
		
		l7.setFont(font2);
		l7.setForeground(Color.red);
		
		
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		ImageIcon icon1 = new ImageIcon("iu.jpg");
		ImageIcon icon2 = new ImageIcon("pro.jpg");
		ImageIcon icon3 = new ImageIcon("new.jpg");
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		b3.setIcon(icon3);
		
		f.add(l1);
		f.add(b1);
		f.add(l2);
		f.add(l5);
		f.add(b2);
		f.add(l3);
		f.add(l6);
		f.add(b3);
		f.add(l4);
		f.add(l7);
		
		
		
		b1.addActionListener(new ActionListener() {
			int iu = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용을 써주세요.
				iu++;
				l5.setText(iu+"표");
			}
		});
		b2.addActionListener(new ActionListener() {
			int promis = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용을 써주세요.
				promis++;
				l6.setText(promis+"표");
			}
		});
		b3.addActionListener(new ActionListener() {
			int stacy = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭할 때마다 처리할 내용을 써주세요.
				stacy++;
				l7.setText(stacy+"표");
			}
		});
		
		
		
		f.setVisible(true);

	}

}
