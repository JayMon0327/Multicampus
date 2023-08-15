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

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame.Scope;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class MemberUI8 {
	private static JTable table;
	private static JScrollPane scrollPane;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(528, 693);

		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("img.jpg"));
		panel.add(lblNewLabel_1);

		JButton b = new JButton("panel reset");
		b.setFont(new Font("굴림", Font.BOLD, 20));
		b.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(b, BorderLayout.NORTH);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.remove(scrollPane);
				panel.repaint();
				
			}
		});
		JButton btnNewButton = new JButton("검색결과");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.remove(scrollPane);
				panel.repaint();
				
				String header[] = { "아이디", "패스워드", "이름", "전화번호" };
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberVO> list = dao.list();

				System.out.println(list.size());
				System.out.println(list);
				
				Object[][] all = new String[list.size()][4];
				for (int i = 0; i < all.length; i++) {
					for (int j = 0; j < 4; j++) {
						all[i][0] = list.get(i).getId();
						all[i][1] = list.get(i).getPw();
						all[i][2] = list.get(i).getName();
						all[i][3] = list.get(i).getTel();
					}
				}

				table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				
				panel.updateUI();
				
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println("ok..");
						// 행
						int rowNo = table.getSelectedRow();

						// 열
						// int colNo = table.getSelectedColumn();

						// 한 줄 다~~ 가지고 와보세요.!
						// Object value = table.getModel().getValueAt(rowNo, colNo); //0,0
						// Object value = table.getModel().getValueAt(rowNo, colNo); //0,0
						Object id = table.getModel().getValueAt(rowNo, 0); // 0,0
						Object pw = table.getModel().getValueAt(rowNo, 1); // 0,1
						Object name = table.getModel().getValueAt(rowNo, 2); // 0,2
						Object tel = table.getModel().getValueAt(rowNo, 3); // 0,3
						JOptionPane.showMessageDialog(table, id + " " + pw + " " + name + " " + tel);
					}
				});
			}
		});

		f.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		f.setVisible(true);
	}
}
