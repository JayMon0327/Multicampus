package 배열응용;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800,600);
		f.getContentPane().setBackground(Color.magenta);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton[] button = new JButton[200];
		int seat[] = new int[200];
		Font font = new Font("d2cording",1,10);
		Font font2 = new Font("d2cording",1,40);
		JLabel result = new JLabel("결과");
		result.setFont(font2);
		result.setForeground(Color.white);
		
		
		for (int i = 0; i < button.length; i++) {
			button[i] = new JButton(i+""); //제발.. 버튼엔  String형태
			button[i].setFont(font);
			button[i].setBackground(Color.blue);
			f.add(button[i]);
			f.add(result);
			button[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					System.out.println(text);
					int code = Integer.parseInt(text);
					if (seat[code] == 1) {
						
						button[code].setBackground(Color.green);
						button[code].setText("마감");
						button[code].setEnabled(false);
						
					}else {
						seat[code] = 1;
						result.setText(text+"번 예약완료");
					}//if
					
				}//for
			});
			
			
		}
	JButton total = new JButton();
	total.setBackground(Color.yellow);
	total.setText("전체내역");
	total.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int s1 = 0;
			int s2 = 0;
			for (int x : seat) {
				if (x == 1) {
					s1++;
				}else {
					s2++;
				}//if
			}//for
			JOptionPane.showMessageDialog(f, "남은좌석" + s2 + "금액" + s1 * 10000 + "원 결제 하시면 됩니다.");
		}
	});
	

		
		
		
		
		
		
		
		
		
		
		
		f.add(total);
		f.setVisible(true);
	}

}
