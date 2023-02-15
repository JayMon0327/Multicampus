package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식고르기 {
	static int count;
	static int count1;
	static int count2;
	final static int price = 20000; // final은 변경불가, 상수
	final static int price1 = 15000; // final은 변경불가, 상수
	final static int price2 = 5000; // final은 변경불가, 상수
//상수변수를 쓸 때는 잘보이라고

	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setTitle(null);
//		ImageIcon icon1 = new ImageIcon("001.png");
//		ImageIcon icon2 = new ImageIcon("002.png");
//		ImageIcon icon3 = new ImageIcon("003.png");
		f.getContentPane().setBackground(Color.white);
		f.setSize(400, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("d2cording", Font.BOLD, 30);
		Font font2 = new Font("d2cording", Font.BOLD, 20);

		JLabel result = new JLabel("개수");
		result.setForeground(Color.red);
		JLabel result2 = new JLabel();
		JLabel img = new JLabel();

		JLabel result3 = new JLabel("결과나오는곳");
		result3.setForeground(Color.magenta);
		JButton food1 = new JButton();
		food1.setText("치킨");
		food1.setFont(font2);
		food1.setBackground(Color.red);
		food1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					count++;
					result2.setText(count +"개");
					
					ImageIcon icon = new ImageIcon("001.png");
					img.setIcon(icon);
					f.setTitle("치킨개수: "+count+"개"+"피자개수: "+count1+"개"+"햄버거개수"+count2+"개");
		
					int total = ((count1 * price1) +(count2 * price2) +(count * price));
					result3.setText("결제금액 "+total + "원");
				
			}
		});
		JButton food2 = new JButton();
		food2.setText("피자");
		food2.setFont(font2);
		food2.setBackground(Color.blue);
		food2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count1++;
				result2.setText(count1 +"개");
				ImageIcon icon = new ImageIcon("002.png");
				img.setIcon(icon);
				f.setTitle("치킨개수: "+count+"개"+"피자개수: "+count1+"개"+"햄버거개수"+count2+"개");
				int total = ((count1 * price1) +(count2 * price2) +(count * price));
				result3.setText("결제금액 "+total + "원");

			}
		});
		JButton food3 = new JButton();
		food3.setText("햄버거");
		food3.setFont(font2);
		food3.setBackground(Color.green);
		food3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count2++;
				result2.setText(count2 + "개");
				ImageIcon icon = new ImageIcon("003.png");
				img.setIcon(icon);
				f.setTitle("치킨개수: "+count+"개"+"피자개수: "+count1+"개"+"햄버거개수"+count2+"개");
				int total = ((count1 * price1) +(count2 * price2) +(count * price));
				result3.setText("결제금액 "+total + "원");

			}
		});

		f.add(food1);
		f.add(food2);
		f.add(food3);
		f.add(result);
		f.add(result2);
		f.add(img);
		f.add(result3,BorderLayout.SOUTH);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
