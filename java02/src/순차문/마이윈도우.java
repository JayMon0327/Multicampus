package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 마이윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(807, 621);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("버튼");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나야 나");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 70));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(88, 95, 224, 433);
		f.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 80));
		textField.setBackground(Color.YELLOW);
		textField.setBounds(362, 98, 327, 430);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		f.setVisible(true);
	}
}
