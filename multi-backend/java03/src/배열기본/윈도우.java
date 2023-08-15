package 배열기본;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		
		f.setLayout(null);
		JPanel p = new JPanel();
		p.setBackground(Color.red);
		p.setLayout(null);
		
		p.setBounds(100, 100, 500, 300);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.red);
		p2.setLayout(null);
		
		p2.setBounds(100, 500, 500, 300);
		f.add(p);
		f.add(p2);
		JButton b1 = new JButton("나야");
		b1.setBounds(1, 10, 100, 100);
		p.add(b1);
		
		JButton b2 = new JButton("나도");
		//b1.setBounds(110, 210, 100, 100);
		p2.add(b2);
		
		f.setVisible(true);
	}

}
