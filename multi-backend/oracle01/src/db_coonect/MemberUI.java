package db_coonect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame(); // f객체 생성
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(516, 595); //가로 500, 세로 600
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 47));
		lblNewLabel.setBounds(116, 27, 238, 53);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(38, 140, 134, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(199, 140, 233, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("패스워드");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(38, 207, 134, 38);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBackground(Color.YELLOW);
		t2.setBounds(199, 207, 233, 38);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_2 = new JLabel("이름");
		lblNewLabel_1_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1_2.setBounds(38, 282, 134, 38);
		f.getContentPane().add(lblNewLabel_1_2);
		
		t3 = new JTextField();
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("굴림", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBackground(Color.YELLOW);
		t3.setBounds(199, 282, 233, 38);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1_3 = new JLabel("전화번호");
		lblNewLabel_1_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1_3.setBounds(38, 353, 134, 38);
		f.getContentPane().add(lblNewLabel_1_3);
		
		t4 = new JTextField();
		t4.setForeground(Color.BLUE);
		t4.setFont(new Font("굴림", Font.BOLD, 25));
		t4.setColumns(10);
		t4.setBackground(Color.YELLOW);
		t4.setBounds(199, 353, 233, 38);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//1. t1, t2, t3, t4에 입력한 값을 가지고 와라!
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				//2. db에 넣기 위해 MemberDAO를 만들어주고
				MemberDAO dao = new MemberDAO();
				//가방을 만들어서, 값들을 넣고, 가방을 전달해보자.
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				dao.insert(bag);
				//3. 회원등록 기능을 쓰기 위해서 insert()메서드를 호출
				//    --> 1번에서 가지온 데이터를 주면서 insert()
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 23));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(12, 436, 155, 94);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 23));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBounds(179, 436, 148, 94);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("회원정보");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String id = JOptionPane.showInputDialog("검색할 id입력");
			//DAO의 one(id)를 호출해서, 검색결과를 받아와서,
			MemberDAO dao = new MemberDAO();
			MemberVO bag = dao.one(id);
			//t1, t2, t3, t4에 넣어보세요.!
			//t1.setText("넣을 값!");
			t1.setText(bag.getId());
			t2.setText(bag.getPw());
			t3.setText(bag.getName());
			t4.setText(bag.getTel());
			}
		});
		btnNewButton_1_1.setForeground(Color.RED);
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 23));
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.setBounds(339, 436, 148, 94);
		f.getContentPane().add(btnNewButton_1_1);
		f.setVisible(true); 
	}
}
