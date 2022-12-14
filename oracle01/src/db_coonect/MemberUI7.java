package db_coonect;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class MemberUI7 {
	private static JTable table;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(528, 693);
		
		String header[] = {"아이디","패스워드","이름", "전화번호"};
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();

		Object[][] all = new String[list.size()][4];
		for (int i = 0; i < all.length; i++) {
			for (int j = 0; j < 4; j++) {
				all[i][0] = list.get(i).getId();
				all[i][1] = list.get(i).getPw();
				all[i][2] = list.get(i).getName();
				all[i][3] = list.get(i).getTel();
			}
		}
		
		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.setSize(450, 600);
		table = new JTable(all, header);
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//행
				int rowNo = table.getSelectedRow();
				
				//열
				int colNo = table.getSelectedColumn();
				
				//한 줄 다~~ 가지고 와보세요.!
				//Object value = table.getModel().getValueAt(rowNo, colNo); //0,0
//				Object value = table.getModel().getValueAt(rowNo, colNo); //0,0
				Object id = table.getModel().getValueAt(rowNo, 0); //0,0
				Object pw = table.getModel().getValueAt(rowNo, 1); //0,1
				Object name = table.getModel().getValueAt(rowNo, 2); //0,2
				Object tel = table.getModel().getValueAt(rowNo, 3); //0,3
				JOptionPane.showMessageDialog(table, id + " " + pw + " " + name + " " + tel);
			}
		});
		
		JButton btnNewButton = new JButton("삭제");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.remove(scrollPane);
				panel.repaint();
			}
		});
		panel.add(btnNewButton);
		
		panel.add(scrollPane);
		scrollPane.setSize(450, 600);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\a\\eclipse-workspace\\oracle01\\img.jpg"));
		panel.add(lblNewLabel_1);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//클릭한 위치의 행번호
				int rowNo = table.getSelectedRow();
				//클릭한 위치의 열번호
				int colNo = table.getSelectedColumn();
				//행,열에 해당하는 값 추출
				Object value = (Object)table.getModel().getValueAt(rowNo, colNo);
				System.out.println(value);
				
				//한 row가지고 오기
				Object value1 = (Object)table.getModel().getValueAt(rowNo, 0);
				Object value2 = (Object)table.getModel().getValueAt(rowNo, 1);
				Object value3 = (Object)table.getModel().getValueAt(rowNo, 2);
				Object value4 = (Object)table.getModel().getValueAt(rowNo, 3);
				System.out.println(value1 + " " + value2 + " " + value3 + " " + value4);
			}
		});
		JLabel lblNewLabel = new JLabel("검색결과");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		f.setVisible(true);
	}
}
