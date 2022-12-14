package db_coonect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class MemberUI3 {
	private static JTable table;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(515, 782);
		
		JLabel lblNewLabel = new JLabel("회원정보목록");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		
		//table의 항목명은 1차원 배열로!
		String[] header = {"아이디","패스워드","이름","전화번호"};
		
		//main()이 시작하자마자, dao.list()
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();
		
		Object[][] all = new Object[list.size()][4]; //행, 열의 개수
		//vo를 꺼내서 1차원 배열을 하나씩 만들어주세요.
		//table의 내용은 2차원 배열로!
		for (int i = 0; i < list.size(); i++) { //
			MemberVO bag = list.get(i); //가방을 1개 꺼내세요.
			all[i][0] = bag.getId();
			all[i][1] = bag.getPw();
			all[i][2] = bag.getName();
			all[i][3] = bag.getTel();
		}
		
//		Object[][] all = {
//				{1, "1234", "홍길동", "011"}, //all[0][0], all[0][1], all[0][2], all[0][3]
//				{2, "1234", "홍길동", "011"}, //all[1][0], all[1][1], all[1][2], all[1][3]
//				{1, "1234", "홍길동", "011"},
//				{2, "1234", "홍길동", "011"},
//				{1, "1234", "홍길동", "011"},
//				{2, "1234", "홍길동", "011"},
//				{1, "1234", "홍길동", "011"},
//				{2, "1234", "홍길동", "011"},
//				{1, "1234", "홍길동", "011"},
//				{2, "1234", "홍길동", "011"},
//				{3, "1234", "홍길동", "011"}
//		};
		table = new JTable(all, header); // 내용, 항목명
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img.jpg"));
		panel.add(lblNewLabel_1);
		
		f.setVisible(true);
	}

}
