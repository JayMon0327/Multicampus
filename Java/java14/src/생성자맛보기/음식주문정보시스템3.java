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

public class 음식주문정보시스템3 {

	// 심화
	// 1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요.!!
	// f.setTitle("짬봉: " + count1 + "개, 우동: " + count2 + "개, " ~~);
	// 2) 음식의 값을 다 분리, 짬뽕은 3500, 우동은 3000, 짜장은 4000

	static int count; // 0으로 초기화, 전역변수!
	static int count1; // 짬뽕
	static int count2; // 우동
	static int count3; // 짜장
	static int[] countTotal = new int[4];
	final static int PRICE = 5000; // final은 변경불가, 상수
	// 상수변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로!를 권장!!!
	final static int PRICE1 = 3500; // 짬뽕
	final static int PRICE2 = 3000; // 우동
	final static int PRICE3 = 4000; // 짜장
	final static int[] PRICETOTAL = { 5000, 3500, 3000, 4000 };
	static String[] food = { "짬뽕", "우동", "짜장" };
	static Color[] colors = { Color.pink, Color.yellow, Color.cyan };
	static JButton[] buttons = new JButton[3];
	static String[] icons = { "111.png", "222.png", "333.png" };
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("음식주문시스템");
		f.setSize(600, 500);
		f.getContentPane().setBackground(Color.green);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font = new Font("궁서", Font.ITALIC, 30);
		JLabel textLabel = new JLabel("개수: ");
		textLabel.setFont(font);
		JLabel countLabel = new JLabel("0개");
		countLabel.setFont(font);
		JLabel imgLabel = new JLabel();
		ImageIcon icon = new ImageIcon("home.png");
		imgLabel.setIcon(icon);
		JLabel result = new JLabel("결제금액 0원");
		result.setFont(font);

		for (int i = 0; i < food.length; i++) {
			buttons[i] = new JButton(food[i]);
			buttons[i].setFont(font);
			buttons[i].setBackground(colors[i]);
			f.add(buttons[i]);

			buttons[i].addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = e.getActionCommand();
					System.out.println(name);
					int index = 0; //
					if(name.equals("짬뽕")) {
						index = 1; //짬뽕
					}else if (name.equals("우동")) {
						index = 2; //우동
					}else{
						index = 3; //짜장
					}
					ImageIcon icon = new ImageIcon(icons[index - 1]);
					imgLabel.setIcon(icon);
					countTotal[0]++;
					countLabel.setText(countTotal[0] + "개");
					countTotal[index]++;
					f.setTitle("짬뽕: " +	countTotal[1] + "개, 우동: " + 
										countTotal[2] + "개, 짜장: " + 
										countTotal[3] + "개");
					int total = 0;
					for (int j = 1; j < countTotal.length; j++) {
						System.out.println(countTotal[j] * PRICETOTAL[j]);
						total = total + (countTotal[j] * PRICETOTAL[j]);
					}
					result.setText("결제금액 " + total + "원");
				}
			});
		}

		f.add(textLabel);
		f.add(countLabel);
		f.add(imgLabel);
		f.add(result);

		f.setVisible(true);
	}

}
