package 상속;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class B extends JPanel {
	//static boolean result;
	메인창 m;
	public B(메인창 m) {
		this.m = m;
		setSize(300, 300);
		JButton push = new JButton("나를 눌러요.");
		add(push);
		push.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//result = true;
				m.change("a");
				
			}
		});
		
		setBackground(Color.blue);
	}
}
