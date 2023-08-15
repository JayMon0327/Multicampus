package 복습;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,500);
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout()); // 한번만 쓸것이라면 이렇게 써도됨. 변수생성 x
		f.add(new JButton("나는버튼")); // 코드가 깔끔해져 좋긴하나 버튼의 설정값을 넣어줄 수가 없음
		f.add(new JLabel("나는 라벨")); // Component <- Jbutton, JLabel,JTextfield (자동형변환)
		f.add(new JTextField(10)); 
		
		f.setVisible(true);
		

	}

}
