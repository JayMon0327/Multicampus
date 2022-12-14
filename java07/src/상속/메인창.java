package 상속;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 메인창 extends JFrame {
	JPanel p;
	static 메인창 m; 
	
	public 메인창() {
		setSize(500, 500);
		JButton a = new JButton("B패널을 열어요!");
		setLayout(new FlowLayout());
		add(a);
		//add(b);
		p = new JPanel();
		add(p);
		p.setSize(300, 300);
		p.add(new A(m));
		
		
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				p.removeAll();
				B b1 = new B(m);
				p.add(b1);
				p.revalidate();
				p.repaint();
			}
		});
		setVisible(true);
	}
	
	public void change(String x) {
		if(x.equals("a")) {
			p.removeAll();
			A a1 = new A(m);
			p.add(a1);
			p.revalidate();
			p.repaint();
		}
	}
	public static void main(String[] args) {
		m = new 메인창();
	}

}
