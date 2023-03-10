package 화면DB연결;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GOODSUI2 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("디저트 예약주문");
		f.setSize(270, 1050);
		
		ImageIcon icon1 = new ImageIcon("1.jpg");
		
		JLabel l1 = new JLabel("1.Lovely범수케이크"+"\n");
		JLabel l2 = new JLabel("(매일50개한정)");
		JLabel l3 = new JLabel(icon1);
		JLabel l4 = new JLabel("범수카페에서 준비한");
		JLabel l5 = new JLabel("\n"+"화이트스페셜케이크로");
		JLabel l6 = new JLabel("\n"+"사랑하는 연인과 로맨스"+"\n");
		JLabel l7 = new JLabel("[예약 및 픽업시간 안내]"+"\n");
		JLabel l8 = new JLabel("오전 11시 - 오후 6시"+"\n");
		
		JButton b1 = new JButton("예약버튼");
		
		ImageIcon icon2 = new ImageIcon("2.jpeg");
		
		JLabel l9 = new JLabel("2.곰발바닥 케이크"+"\n");
		JLabel l10 = new JLabel("(커스텀 주문가능)");
		JLabel l11 = new JLabel(icon2);
		JLabel l12 = new JLabel("곰발바닥 케이크에서");
		JLabel l13 = new JLabel("\n"+"특별한 생일케이크를");
		JLabel l14 = new JLabel("\n"+"주문해보세요");
		JLabel l15 = new JLabel("\n"+"[예약 및 픽업시간 안내]");
		JLabel l16 = new JLabel("\n"+"오전 11시 - 오후 6시"+"\n");
		
		JButton b2 = new JButton("예약버튼");
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font = new Font("d2cording", Font.BOLD, 30);
		Font font2 = new Font("d2cording", 0, 18);

		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		/// 조립을 시작해보자. ///
		
		
		f.setLayout(flow);
		//1번 메뉴
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(b1);
		
		//2번 메뉴
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(b2);

		//1번 메뉴
		l1.setFont(font);
		l2.setFont(font);
		l4.setFont(font2);
		l5.setFont(font2);
		l6.setFont(font2);
		l7.setFont(font2);
		l7.setFont(font2);
		l8.setFont(font2);
		
		b1.setFont(font);
		
		//2번 메뉴
		l9.setFont(font);
		l10.setFont(font);
		l11.setFont(font2);
		l12.setFont(font2);
		l13.setFont(font2);
		l14.setFont(font2);
		l15.setFont(font2);
		l16.setFont(font2);
		
		b2.setFont(font);
		
		//1번
		l1.setForeground(Color.pink);
		l2.setForeground(Color.pink);
		l3.setForeground(Color.pink);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		l6.setForeground(Color.black);
		l7.setForeground(Color.black);
		l8.setForeground(Color.black);

		b1.setForeground(Color.green); // 글자색
		//2번
		l9.setForeground(Color.pink);
		l10.setForeground(Color.pink);
		l11.setForeground(Color.pink);
		l12.setForeground(Color.black);
		l13.setForeground(Color.black);
		l14.setForeground(Color.black);
		l15.setForeground(Color.black);
		l16.setForeground(Color.black);
		
		b2.setForeground(Color.green); // 글자색

		f.getContentPane().setBackground(Color.white);
		// 맨 끝으로~~~~~
		f.setVisible(true);

	}

}
