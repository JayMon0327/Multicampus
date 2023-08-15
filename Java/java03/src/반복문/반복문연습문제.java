package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 반복문연습문제{

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.green);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		
		JButton b1 = new JButton();
		b1.setText("별10개");
		JButton b2 = new JButton();
		b2.setText("커피5개");
		JButton b3 = new JButton();
		b3.setText("커피*우유3");
		JButton b4 = new JButton();
		b4.setText("1짱!");
		
		Font font = new Font("궁서", 1 , 30);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		b1.setBackground(Color.pink);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.blue);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		//1. 버튼 에다가 액션 기능을 추가하겠다고 설정
		//2. 클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b1을 클릭");
				for (int i = 0; i < 10; i++) {
					System.out.println("*");
						
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b2을 클릭");
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b3을 클릭");
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});
		b4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
		//클릭했을 때 처리 내용을 여기에 써주세요!
				System.out.println("b4을 클릭");
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) +": 짱"); // 앞에서 부터 계산 할때는 괄호 처리 안해도됨. 알죠 ? 앞에 문자부터 계산
														// 하지만 명확하기 위해서 괄호처리 합시다 !
					
				}
			}
		});
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
