package 제어문;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템심화 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 150);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text1 = new JLabel();
		text1.setText("k-pop 인기 투표");
		JLabel text2 = new JLabel();
		text1.setText("1. 아이유-라일락");
		JLabel text3 = new JLabel();
		text1.setText("2표");
		JLabel text4 = new JLabel();
		text1.setText("2. 프로미스나인-we go");
		JLabel text5 = new JLabel();
		text1.setText("6표");
		JLabel text6 = new JLabel();
		text1.setText("3. 스테이씨 - ASAP");
		JLabel text7 = new JLabel();
		text1.setText("2표");
		
		JButton iu = new JButton();
		ImageIcon iu1 = new ImageIcon("iu.jpg");
		
		
		JButton promis = new JButton();
		ImageIcon promis1 = new ImageIcon("promis.jpg");
		JButton stayc = new JButton();
		ImageIcon stayc1 = new ImageIcon("stacy.jpg");
		
		
		
		
		
		
		f.add(iu);
		f.add(promis);
		f.add(stayc);
		f.add(text1);
		f.add(text2);
		f.add(text3);
		f.add(text4);
		f.add(text5);
		f.add(text6);
		f.add(text7);
		
		
		
		iu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int iu = 0;
				iu++;
				text3.setText(iu+"표");
				
			}
		});
		
		
		
		
		
		
		
		f.setVisible(true);
		

	}

}
