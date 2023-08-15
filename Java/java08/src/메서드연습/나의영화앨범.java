package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2;

	public static void main(String[] args) {
		String[] title = { "슬램덩크", "타이타닉", "아바타", "교섭", "바빌론" };
		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };
		double[] jumsu = { 9.28, 9.72, 8.87, 6.28, 8.6 };

//		ImageIcon movie1 = new ImageIcon("1.png");
//		ImageIcon movie2 = new ImageIcon("2.png");
//		ImageIcon movie3 = new ImageIcon("3.png");
//		ImageIcon movie4 = new ImageIcon("4.png");
//		ImageIcon movie5 = new ImageIcon("5.png");

		JFrame f = new JFrame();
		Font font = new Font("d2cording", Font.BOLD, 40); // 객체 생성을 하는데, 특정한 입력값을 넣지 않으면 못 만들게 할 수 있음
		Font font2 = new Font("d2cording", 1, 10);
		// 배치부품(객체)를 바꾸어 주지 않으면 경계 레이아웃을 사용하도록 셋팅되어있음
		f.setSize(260, 530);
		f.getContentPane().setBackground(Color.green);

		JLabel top = new JLabel(title[2]);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.magenta);

		JLabel center = new JLabel();
//		center.setIcon(movie3);
		top.setHorizontalAlignment(0);
		center.setFont(font);
		center.setForeground(Color.magenta);

		// String.valueof() : int,double,.... -> String으로 변환
		// int+""
		// Integer.parse() : double, String ... -> int으로 변환
		// Double.parse() : int, String, .... -> double으로 변환
		JLabel under = new JLabel(jumsu[2] + "");
		under.setHorizontalAlignment(0);
		under.setFont(font);
		under.setForeground(Color.magenta);

		// 액션처리하는방법 1)액션기능을 add 2)클릭액션이 있을 때 처리할 부품을 만들어주세요.
		// 3)클릭액션이 있을 때 어떻게 처리할지 내용을 코딩해주세요
		JButton left = new JButton();
		left.setFont(font2);
		left.setText("<<");
		left.setBackground(Color.yellow);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 인덱스보다 하나 적은 값들로 top,center, under를 setting
					top.setText(title[index - 1]);
					under.setText(jumsu[index - 1] + "");
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					index--; // index = index+1; index +=1;
				}
				else {
					JOptionPane.showMessageDialog(f, "여기가 왼쪽끝입니다.");
					index = 2;
				}
			}
		});
		JButton right = new JButton();
		right.setFont(font2);
		right.setText(">>");
		right.setBackground(Color.yellow);
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					// 현재 인덱스보다 하나 적은 값들로 top,center, under를 setting
					top.setText(title[index + 1]);
					under.setText(jumsu[index + 1] + "");
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					index++; // index = index+1; index +=1;
				}
				else {
					JOptionPane.showMessageDialog(f, "여기가 오른쪽 끝입니다");
					index = 2;
				}
			}
		});

		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(under, BorderLayout.SOUTH);
		f.add(left, BorderLayout.WEST);
		f.add(right, BorderLayout.EAST);

		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setVisible(true);
	}

}
