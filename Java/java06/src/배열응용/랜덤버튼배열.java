package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 것이 아니고, 참조형
		// 정수, 실수, 문자1 , 논리 + String + JBotton ,.....
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 주소가 저장 
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setLayout(null); //위치 자동으로 잡아주는 부품 안씀
		
		// 버튼 200개 들어갈 배열
		JButton[] button = new JButton[200];
		// 버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < button.length; i++) {
			button[i] =  new JButton("버튼 "+i);
		}
		//위치를 지정해서 넣어주자. 
		
		Random r = new Random(42);
		for (int i = 0; i < button.length; i++) {
			//null - > 조립해서 넣을 부품의 주소가 램에 없음
			//첫번째 버튼을 가로 500, 세로 500 위치, 크기 100x50
			//위치와 크기만 지정
			int x = r.nextInt(800);
			int y = r.nextInt(700);
			
			button[i].setBounds(200, 300, 100, 50);
			//button[1].setBounds(300, 300, 100, 50);
			
			f.getContentPane().add(button[i]);
		}
		
		//f.add(button[1]);
		
		f.setVisible(true);
	}

}
