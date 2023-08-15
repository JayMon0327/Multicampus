package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.xml.soap.Text;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300,500);
		f.setTitle("글자/단어 길이 판독기");
		
		f.setLayout(new FlowLayout());
		Font font = new Font("d2cording",1,20);
		
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		
		JTextArea area = new JTextArea(10,12);
		
		
		label1.setText("Words : ");
		label2.setText("");
		
		
		
		label1.setFont(font);
		label2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		area.setFont(font);
		
		area.setBackground(Color.black);
		area.setForeground(Color.white);
		b1.setBackground(Color.red);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.green);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = area.getText(); //입력한 문장
				int b = a.length();
				label1.setText(b+"");
				
			}
		});

b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				area.setBackground(Color.yellow);
				
				
			}
		});
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		area.setForeground(Color.red);
		
		
	}
});
		
		f.add(label1);
		f.add(label2);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		f.setVisible(true);
		
	}

}
