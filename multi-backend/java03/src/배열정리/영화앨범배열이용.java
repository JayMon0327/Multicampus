package 배열정리;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범배열이용 {
	static int now = 2;//현재 위치를 체크할 수 있는 변수

	public static void main(String[] args) {
		// 영화제목목록, 이미지목록, 감독목록, 평점목록
		String[] titles = { "다만 악에서", "오케이 마담", "테넷", "짱구는 못말려", "캐리비안 해적" };
		String[] images = { "다만.png", "오케이.png", "테넷.png", "짱구.png", "해적.png" };
		String[] directors = { "홍원찬", "오케이감독", "크리스토퍼 놀란", "하시모토 마사카즈", "마리트 모움" };
		double[] rates = { 7.79, 6.61, 8.88, 9.99, 5.65 };

		JFrame f = new JFrame();
		f.setTitle("나의 영화앨범");
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(606, 477);
		f.getContentPane().setLayout(null);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon(images[2]));
		img.setBounds(96, 123, 195, 270);
		f.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 29));
		lblNewLabel_2.setBounds(303, 140, 67, 43);
		f.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directors[2]);
		director.setForeground(Color.RED);
		director.setFont(new Font("굴림", Font.BOLD, 25));
		director.setBounds(303, 182, 203, 48);
		f.getContentPane().add(director);

		JLabel lblNewLabel_2_1 = new JLabel("평점");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.BOLD, 29));
		lblNewLabel_2_1.setBounds(303, 258, 67, 43);
		f.getContentPane().add(lblNewLabel_2_1);

		JLabel rate = new JLabel(rates[2] + "");
		rate.setForeground(Color.RED);
		rate.setFont(new Font("굴림", Font.BOLD, 25));
		rate.setBounds(303, 300, 179, 48);
		f.getContentPane().add(rate);

		JButton title = new JButton(titles[2]);
		title.setForeground(Color.WHITE);
		title.setBackground(Color.BLUE);
		title.setFont(new Font("굴림", Font.BOLD, 45));
		title.setBounds(94, 10, 400, 77);
		f.getContentPane().add(title);
		JButton btnNewButton = new JButton("<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 0) {
					now = 5;
				}
				now--;//1
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(0, 0, 84, 438);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now == 4) {
					now = -1;
				}
				now++;//3
				title.setText(titles[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directors[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(506, 0, 84, 438);
		f.getContentPane().add(btnNewButton_1);

		f.setVisible(true);
	}
}
