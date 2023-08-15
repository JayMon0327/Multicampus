package 상속응용;

import java.util.Date;

public class 이미지스레드 extends Thread{
@Override
public void run() {
	String[] images = {
			"1.png","2.png","3.png","4.png","5.png",
			"1.png","2.png","3.png","4.png","5.png",
			"1.png","2.png","3.png","4.png","5.png",
			"1.png","2.png","3.png","4.png","5.png",
			"1.png","2.png","3.png","4.png","5.png",
	};
	for (int i = 0; i < images.length; i++) {
		System.out.println("이미지 >> " + images[i]);
		
		
		//cpu에게 스레드 쉬는 시간 텀을 알려줍시다.!
		//thread를 잠깐 재울 수 있음.
		//cpu는 외부자원입니다.
		//자바가 외부자원을 연결할 때는 엄청! 위험해!!! 라는 상황으로 인식합니다.
		//만약에 문제가 생기면, 어떻게 할지를 코드를 반드시 해주어야 함. -> try catch
		try {
			Thread.sleep(5000); // 5초 재워라 ! //ms(밀리세컨즈)
		} catch (Exception e) {
			System.out.println("cpu 연결 문제 생김.");
		}
	}
}	
}
