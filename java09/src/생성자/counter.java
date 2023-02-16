package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//심화
//1- 버튼을 클릭 했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요.!!
// f.setTitle("짬봉: " +count1 +"개, 우동: "+count2 + "개"
//2- 음식의 값을 다 분리, 짬뽕은 3500, 우동은 3000, 짜장은 4000

public class counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.cyan);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("1더하기");
		JButton b2 = new JButton("0으로초기화");
		JButton b3 = new JButton("1빼기");

		Font font = new Font("d2cording", Font.BOLD, 10);
		Font font1 = new Font("d2cording", font.TYPE1_FONT, 150);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		b1.setBackground(Color.magenta);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.red);

		JLabel result = new JLabel();
		result.setFont(font1);
		result.setForeground(Color.magenta);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				result.setText(count + "");

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int total = count = 0;
				result.setText(total + "");

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				result.setText(count + "");

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(result);

		f.setVisible(true);
	}

}
