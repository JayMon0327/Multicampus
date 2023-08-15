package db_coonect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MemberUI2 {
	private static JTable table;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(501, 515);
		
		JLabel lblNewLabel = new JLabel("회원정보목록");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		
		//table의 항목명은 1차원 배열로!
		String[] header = {"아이디","패스워드","이름","전화번호"};
		
		//
		
		//table의 내용은 2차원 배열로!
		Object[][] all = {
				{1, "1234", "홍길동", "011"},
				{2, "1234", "홍길동", "011"},
				{1, "1234", "홍길동", "011"},
				{2, "1234", "홍길동", "011"},
				{1, "1234", "홍길동", "011"},
				{2, "1234", "홍길동", "011"},
				{1, "1234", "홍길동", "011"},
				{2, "1234", "홍길동", "011"},
				{1, "1234", "홍길동", "011"},
				{2, "1234", "홍길동", "011"},
				{3, "1234", "홍길동", "011"}
		};
		table = new JTable(all, header); // 내용, 항목명
		
		JScrollPane scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		
		f.setVisible(true);
	}

}
