package 상속;

import java.awt.Color;

import javax.swing.JPanel;

public class A extends JPanel {
	메인창 m;
	public A(메인창 m) {
		this.m = m;
		setSize(300, 300);
		setBackground(Color.red);
		
	}
}
