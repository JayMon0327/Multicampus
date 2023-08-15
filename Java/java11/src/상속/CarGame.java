package 상속;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{

	public static void main(String[] args) {
		new CarGame();
	}
	public CarGame() {
		setTitle("나의 자동차 경주게임");
		setSize(1000,550);
		setLayout(null);
		getContentPane().setBackground(Color.green);
		MyThread car1 = new MyThread("001.png",100,0);
		MyThread car2 = new MyThread("002.png",100,400);
		MyThread car3 = new MyThread("003.png",100,100);
		MyThread car4 = new MyThread("004.png",100,200);
		MyThread car5 = new MyThread("005.png",100,300);
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		
		
		setVisible(true);
	}
	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 전역변수로 선언!

		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200); //Jframe에 붙을 위치 지정
			add(label);
		}

		@Override
		public void run() {
			// 동시에 실행하고 싶은 내용!!
			// 모든 스레드가 오른쪽으로 움직이고 싶음.
			// 화면에서 오른쪽으로 움직이는 것은 x을 늘려주는 것.!
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50); //0~49
				x = x + move;
				label.setBounds(x, y, 100, 100); // 다시 위치지정
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
