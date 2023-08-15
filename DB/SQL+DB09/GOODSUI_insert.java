package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import oracle.jdbc.driver.T4CXAConnection;
import 자바DB연결.GOODSDAO2;


public class GOODSUI_insert {

	

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("예약정보시스템");
		f.setSize(300, 500);
		
		JLabel l1 = new JLabel("디저트 예약");
		JLabel l2 = new JLabel("\n"+"상품번호");
		JLabel l3 = new JLabel("상품개수");
		JLabel l4 = new JLabel("상품가격");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
//		t3.setText("가격칸 입력x");
		
		JButton b1 = new JButton("상품예약");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("상품예약");
				String GNUMBER = t1.getText();
				String GAMOUNT = t2.getText();
				String GPRICE =  t3.getText();
				String ID = t4.getText();
				
				
//				if (GNUMBER.equals("")) { // 기본형 4가지만 == 로 값을 비교 가능!
//					JOptionPane.showMessageDialog(f, "상품번호 필수입력");
//				}
				GOODSDAO2 dao = new GOODSDAO2();
				GOODSVO bag = new GOODSVO();
				bag.setID(ID);
				bag.setGNUMBER(GNUMBER);
				bag.setGAMOUNT(GAMOUNT);
				bag.setGPRICE(GPRICE);
				// 1 or 0
//				if (GNUMBER.equals("1")) {
//					t3.setText(7000+"");
//					
//				}if(GNUMBER.equals("2")) {
//					t3.setText(9000+"");
//					
//				}	
				int result = dao.insert(bag);
				if (result == 1) {
					JOptionPane.showMessageDialog(f, "예약성공");
				} else {
					JOptionPane.showMessageDialog(f, "예약실패");
				}//if
			
			}// action
		}); // b1

		// f에 위에 있는 요소들을 add로 붙여주어야하는데,
		// 붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		// 물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();

		// 폰트를 설정하기 위해 font부품 필요
		Font font2 = new Font("d2cording", Font.BOLD, 50);
		Font font = new Font("d2cording",1,25);
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		/// 조립을 시작해보자. ///
		f.setLayout(flow);

		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(l3);
		f.add(t2);
		f.add(l4);
		f.add(t3);
		f.add(t4);

		f.add(b1);


		l1.setFont(font2);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
	
		b1.setFont(font);

		
		l1.setForeground(Color.pink);
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.black);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.black);
		t3.setBackground(Color.magenta);
		t3.setForeground(Color.white);


		b1.setBackground(Color.pink); // 배경색
		b1.setForeground(Color.pink); // 글자색


		f.getContentPane().setBackground(Color.white);
		// 맨 끝으로~~~~~
		f.setVisible(true);

	}

	

}