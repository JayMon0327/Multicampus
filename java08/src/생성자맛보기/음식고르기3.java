package 생성자맛보기;

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

public class 음식고르기3 {
	static int count;
	static int count1;
	static int count2;

	final static int price = 20000;
	final static int price1 = 10000;
	final static int price2 = 5000;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.orange);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("치킨");
		JButton b2 = new JButton("피자");
		JButton b3 = new JButton("햄버거");
		JButton b4 = new JButton("결제하기");

		Font font = new Font("d2cording", Font.ROMAN_BASELINE, 30);
		Font font1 = new Font("d2cording", font.TYPE1_FONT, 15);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b1.setBackground(Color.magenta);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.red);
		b4.setBackground(Color.CYAN);

		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		textLabel.setForeground(Color.red);

		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		countLabel.setForeground(Color.black);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("001.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font1);
		result.setForeground(Color.magenta);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				countLabel.setText(count + "개");
				ImageIcon icon = new ImageIcon("001.png");
				imgLabel.setIcon(icon);
				f.setTitle("치킨:" + count + "개" + "피자: " + count1 + "개" + "햄버거" + count2 + "개");
				int total = ((count * price) + (count1 * price1) + (count2 * price2));
				result.setText("금액" + total + "원");

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count1++;
				countLabel.setText(count1 + "개");
				ImageIcon icon = new ImageIcon("002.png");
				imgLabel.setIcon(icon);
				f.setTitle("치킨:" + count + "개 " + "피자: " + count1 + "개 " + "햄버거" + count2 + "개 ");
				int total = ((count * price) + (count1 * price1) + (count2 * price2));
				result.setText("금액" + total + "원");

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count2++;
				countLabel.setText(count2 + "개");
				ImageIcon icon = new ImageIcon("003.png");
				imgLabel.setIcon(icon);
				f.setTitle("치킨:" + count + "개" + "피자: " + count1 + "개" + "햄버거" + count2 + "개");
				int total = ((count * price) + (count1 * price1) + (count2 * price2));
				result.setText("금액" + total + "원");

			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f.setTitle("치킨:" + count + "개" + "피자: " + count1 + "개" + "햄버거" + count2 + "개");
				int total = ((count * price) + (count1 * price1) + (count2 * price2));
				result.setText("총 구매 수량은 " + "치킨 " + count + "개\n" + "피자 " + count1 + "개\n" + "햄버거 " + count2 + "개\n"
						+ "총 결제금액은 " + total + "원");

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(b4);
		f.add(result);

		f.setVisible(true);
	}

}