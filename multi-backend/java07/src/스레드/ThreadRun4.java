package 스레드;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ThreadRun4 extends JFrame {
	JLabel top = new JLabel("1"); //전역변수, 글로벌변수
	JLabel center = new JLabel("2");
	JLabel sub = new JLabel("3");

	public ThreadRun4() {
		getContentPane().setBackground(Color.GREEN);
		setTitle("나의 멀티스레드");
		setSize(875, 360);
		
		top.setFont(new Font("Arial Narrow", Font.BOLD, 65));
		getContentPane().add(top, BorderLayout.NORTH);
		
		center.setFont(new Font("굴림", Font.PLAIN, 54));
		getContentPane().add(center, BorderLayout.CENTER);
		
		sub.setFont(new Font("Arial Narrow", Font.BOLD, 50));
		getContentPane().add(sub, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		getContentPane().add(lblNewLabel_1, BorderLayout.EAST);
		
		CounterThread2 counter = new CounterThread2();
		counter.start();
		
		
		
		
		setVisible(true);
	}

	//내부클래스(inner class)
	//변수를 다른 클래스와 공유할 목적
	//단점: 내부클래스는 독립적으로 사용 불가
	public class CounterThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				top.setText("Counter: " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	public static void main(String[] args) {
		ThreadRun4 t = new ThreadRun4();
	}

}
