package 스레드상속확인문제;

import java.util.Date;

import javax.swing.JOptionPane;

public class 저녁식사시간 extends Thread {
	@Override
	public void run() {
		Date date = new Date();
		for (int i = 1200; i > 0; i--) {
			System.out.println("6시에 식사 >> : " + date);
			if (i == 1) {
				System.out.println("저녁시간입니다.");

				try {
					Thread.sleep(1000); // 1초 x 1200초 = 20분
				} catch (Exception e) {
					System.out.println("cpu Error");
				}
			} // for
		}
	}
}
