package 상속응용;

import java.util.Date;

public class 타이머스레드 extends Thread{
@Override
public void run() {
	for (int i = 1000; i > 0; i--) {
		Date date = new Date();
		
		System.out.println("타이머 >> : "+ date);
		//cpu에게 스레드 쉬는 시간 텀을 알려줍시다.!
		//thread를 잠깐 재울 수 있음.
		//cpu는 외부자원입니다.
		//자바가 외부자원을 연결할 때는 엄청! 위험해!!! 라는 상황으로 인식합니다.
		//만약에 문제가 생기면, 어떻게 할지를 코드를 반드시 해주어야 함. -> try catch
		try {
			Thread.sleep(1000); // 1초 재워라 ! 
		} catch (Exception e) {
			System.out.println("cpu 연결 문제 생김.");
		}
	}
}	
}
