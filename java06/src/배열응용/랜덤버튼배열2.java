package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들어보세요. 실행에서 눈으로 확인
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		// 2. 프레임을 설정해보세요
		f.setLayout(null);
		f.getContentPane().setBackground(Color.yellow);
		// 3. 버튼을 넣을 배열을 만들어 보세요 500개
		JButton[] button = new JButton[500];
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton("버튼"+i); //JButtion String만 들어가게끔 만들어진 부품임
			
		}
		Random random = new Random(42);
		Color[] colors = {Color.red, Color.blue, Color.white,Color.gray,Color.orange};
		for (int i = 0; i < button.length; i++) {
			int x = random.nextInt(1000);
			int y = random.nextInt(1000);
			button[i].setBounds(x, y, 100, 50);
			button[i].setBackground(colors[random.nextInt(colors.length)]);
			f.getContentPane().add(button[i]);
		}
		
		
		f.setVisible(true);
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후 f에 붙여주세요.
	}

}
