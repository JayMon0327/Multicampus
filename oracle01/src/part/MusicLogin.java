package part;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MusicLogin {
	private static JTextField t1;
	private static JTextField t2;
	
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setSize(700, 800);
		f.getContentPane().setBackground(new Color(255, 255, 255));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MUSIC");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(272, 67, 147, 79);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("�޸ո���T", Font.PLAIN, 20));
		t1.setBounds(201, 212, 391, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("�޸ո���T", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(201, 318, 391, 55);
		f.getContentPane().add(t2);
		
		JLabel lblId = new JLabel("ID");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblId.setBounds(48, 212, 124, 59);
		f.getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblPw.setBounds(48, 318, 124, 59);
		f.getContentPane().add(lblPw);
		
		JButton b1 = new JButton("\uB85C\uADF8\uC778");
		b1.setFont(new Font("�޸ո���T", Font.BOLD, 20));
		b1.setForeground(new Color(255, 255, 255));
		b1.setBackground(new Color(86, 86, 86));
		b1.setBounds(154, 608, 161, 49);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b2.setFont(new Font("�޸ո���T", Font.BOLD, 20));
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(86, 86, 86));
		b2.setBounds(393, 608, 161, 49);
		f.getContentPane().add(b2);
		
		
		
		f.setVisible(true);	
	}
}