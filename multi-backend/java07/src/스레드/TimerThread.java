package 스레드;

import java.util.Date;

public class TimerThread extends Thread {
	//@ => hera@naver.com(at, -에)
	//@ => Annotation(표시, 표기) :기능없음.지워도됨
	//    어노테이션
	//@Component => 기능있음. new!객체생성
	@Override //오버라이드, 재정의
	public void run() {
		for (int i = 0; i < 300; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
