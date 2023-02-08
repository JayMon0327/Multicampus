package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		//틀!! 이 있어서 그 틀을 가지고 찍어서 필요한 부품을 만들어 CPU가 조립!
		
		//new: 틀을 가지고 찍어낼때 사용
		//new JFrame()는 JFrame이라는 틀을 이용해서 부품을 찍어내라!
		//만든 부품은 모두다 ram에 저장되어야 한다.
		//f변수 만들어서 부품을 넣어주세요.
		//f에는 JFrame이 저장되어야함.
		JFrame f = new JFrame();
		f.setSize(300,300);

		JButton b1 = new JButton();
		b1.setText("나는 버튼1");
		
		
		//보여주는 것은 맨 끝으로!
		f.setVisible(true);
		f.add(b1);

	}

}
