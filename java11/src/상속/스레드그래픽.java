package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame{
	//add(), setSize(),,,
	JLabel count, image,time; // 전역 변수 선언
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽(); // ---1번
		//객체 생성시 클래스 이름과 동일한 매서드를 자동호출
		// --> 생성자 메서드 !! 를 자동호출 
	}
	public 스레드그래픽() { // -----2번
		setTitle("내 스레드 그래픽");
		
		setSize(500,250);
		getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		Font font1 = new Font("d2cording", Font.BOLD , 20);
		count = new JLabel("카운터");
		ImageIcon icon = new ImageIcon("001.png");
		image = new JLabel(icon);
		time = new JLabel("시분초");
		count.setFont(font1);
		time.setFont(font1);
		
		add(count);
		add(image);
		add(time);
		
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();
		카운트스레드2 count2 = new 카운트스레드2();
		count2.start();
		image2.start();
		time2.start();
		
		setVisible(true);
	}
	//내부클래스(inner class) -> 전역변수 공유할 목적으로 사용 !! (자주 사용하진 않지만 쓰는사람들 있음)
	//스레드 그래픽 안에 내부클래스를 3개를 끼워넣었음.
	//전역변수를 공유할 수는 있지만, 내부클래스가 독립적으로 사용 불가능 ! 
	public class 카운트스레드2 extends Thread{
		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트 : "+i);
				//cpu에게 스레드 쉬는 시간 텀을 알려줍시다.!
				//thread를 잠깐 재울 수 있음.
				//cpu는 외부자원입니다.
				//자바가 외부자원을 연결할 때는 엄청! 위험해!!! 라는 상황으로 인식합니다.
				//만약에 문제가 생기면, 어떻게 할지를 코드를 반드시 해주어야 함. -> try catch
				try {
					Thread.sleep(2000); //1000이 1초 단위 이러면 2초가 지나야 실행반복하는 코드가 됨.
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}	
		}
	public class 타이머스레드2 extends Thread{
		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				
				time.setText(date+"");
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
	public class 이미지스레드2 extends Thread{
		@Override
		public void run() {
			String[] images = {
					"001.png","002.png","003.png","004.png","005.png",
					"001.png","002.png","003.png","004.png","005.png",
					"001.png","002.png","003.png","004.png","005.png",
					"001.png","002.png","003.png","004.png","005.png",
					"001.png","002.png","003.png","004.png","005.png",
					
			};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				
				
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

	
}//class
