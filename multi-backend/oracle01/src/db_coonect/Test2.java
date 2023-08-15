package db_coonect;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
public class Test2 {
	public static JTextField t1;
	private static JTable table;
	private static JScrollPane scrollPane;
	public static void main(String[] args) throws Exception{
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(1200, 900);
		f.getContentPane().setLayout(null);
		
		String header[] = {"책ID", "책이름", "저자", "출판사"};
		//ShopDAO dao = new ShopDAO();
		//ArrayList<ShopVO> list = dao.list();
		
		Object[][] all = {
		{1, "1234", "홍길동", "011"}, //all[0][0], all[0][1], all[0][2], all[0][3]
		{2, "1234", "홍길동", "011"}, //all[1][0], all[1][1], all[1][2], all[1][3]
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
		
		
		JLabel lblNewLabel = new JLabel("HOME");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 53));
		lblNewLabel.setBounds(42, 48, 173, 103);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(293, 69, 627, 84);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(175, 316, 872, 438);
		f.getContentPane().add(panel);
		
		table = new JTable(all, header);
		
				
		
		scrollPane = new JScrollPane(table);
		panel.add(scrollPane);
		
		JLabel label = new JLabel("New label");
		scrollPane.setColumnHeaderView(label);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(209, 183, 779, 47);
		f.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("전체 BEST");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("추천 도서");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("신규 도서");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("나의 도서");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4_1 = new JButton("도서샵");
		btnNewButton_4_1.setFont(new Font("굴림", Font.PLAIN, 25));
		panel_1.add(btnNewButton_4_1);
		
		JLabel lblNewLabel_1 = new JLabel("중고 도서 목록");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(452, 256, 273, 50);
		f.getContentPane().add(lblNewLabel_1);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("됐다");
			}
		});
		JButton btnNewButton_44 = new JButton("검색");
		
		
		btnNewButton_44.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("됐다");
				
				panel.remove(scrollPane);
				panel.repaint();
				String header[] = {"책ID", "책이름", "저자", "출판사"};
				Object[][] all = {
				{1, "1234", "홍길동", "011"}, //all[0][0], all[0][1], all[0][2], all[0][3]
				{2, "1234", "홍길동", "011"}, //all[1][0], all[1][1], all[1][2], all[1][3]
				{1, "1234", "홍길동", "011"},
			
		};
				table = new JTable(all, header);
				scrollPane = new JScrollPane(table);
				panel.add(scrollPane);
				panel.updateUI();
			}
		});
//		btnNewButton_4.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e)  {
//					
//						panel.remove(scrollPane);
//						panel.repaint();
//						
//						String keyword = t1.getText();
//						String header[] = {"책ID", "책이름", "저자", "출판사", "장르", "등록일"};
//						ShopDAO dao = new ShopDAO();
//						ArrayList<ShopVO> list;
//						try {
//							list = dao.search(keyword);
//							System.out.println(list.size());
//							System.out.println(list);
//							Object[][] all = new String[list.size()][6];
//							
//							for (int i = 0; i < all.length; i++) {
//									all[i][0] = list.get(i).getId();
//									all[i][1] = list.get(i).getName();
//									all[i][2] = list.get(i).getAuthor();
//									all[i][3] = list.get(i).getPublisher();
//									all[i][4] = list.get(i).getGenre();
//									all[i][5] = list.get(i).getDate();
//										
//							};
//									
//						} catch (Exception e1) {
//							// TODO 자동 생성된 catch 블록
//							e1.printStackTrace();
//						}
//						
//
//						table = new JTable(all, header);
//						JScrollPane scrollPane = new JScrollPane(table);
//						panel.add(scrollPane);
//						panel.updateUI();
//						table.addMouseListener(new MouseAdapter() {
//							@Override
//							public void mouseClicked(MouseEvent e) {
//								System.out.println("ok..");
//								int rowNo = table.getSelectedRow();
//
//								Object id = table.getModel().getValueAt(rowNo, 0);	
//								Object name = table.getModel().getValueAt(rowNo, 1);
//								Object author =table.getModel().getValueAt(rowNo, 2);
//								Object publisher = table.getModel().getValueAt(rowNo, 3);
//								Object genre = table.getModel().getValueAt(rowNo, 4);
//								Object date = table.getModel().getValueAt(rowNo, 5);
//								JOptionPane.showMessageDialog(table,id+" " + name + " " + author + " "+ publisher + " " + genre + " " + date);
//							
//							}
//						});
//			}
//		});
//		btnNewButton_4.setBounds(971, 94, 104, 47);
//		f.getContentPane().add(btnNewButton_4);
		btnNewButton_44.setBounds(971, 94, 104, 47);
		f.getContentPane().add(btnNewButton_44);
		
//		JButton btnNewButton_5 = new JButton("중고 도서 등록");
//		btnNewButton_5.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				new ShopRegisterUI();
//			}
//		});
//		btnNewButton_5.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_5.setBounds(532, 778, 130, 47);
//		f.getContentPane().add(btnNewButton_5);
		f.setVisible(true);
	}
}