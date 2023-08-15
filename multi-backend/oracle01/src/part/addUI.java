package part;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addUI {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(700, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("음악 추가");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(292, 39, 158, 48);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("곡명");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1.setBounds(76, 151, 100, 25);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("앨범명");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(76, 228, 100, 25);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("가수명");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(76, 309, 100, 25);
		f.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("발매일");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(76, 383, 100, 25);
		f.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("링크");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(76, 468, 100, 25);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("글쓴이(ID)");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(76, 542, 100, 25);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1_1);

		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setBounds(240, 150, 315, 26);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(240, 227, 315, 26);
		f.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(240, 308, 315, 26);
		f.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(240, 382, 315, 26);
		f.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(240, 467, 315, 26);
		f.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(240, 541, 315, 26);
		f.getContentPane().add(textField_5);

		JButton btnNewButton = new JButton("저장");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnNewButton.setBounds(270, 650, 117, 29);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("목록으로");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnNewButton_1.setBounds(34, 60, 117, 29);
		f.getContentPane().add(btnNewButton_1);
		
		f.setVisible(true);
	}

}