package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {
	public static void main(String[] args) {
		// JFrame, imageicon, imagelabel
		// idlabel, pwlabel, id입력값,pw입력값
		// 로그인 버튼, reset버튼
		// flowlayout, font
		JFrame f = new JFrame();
		f.setSize(300, 600);
		
		f.getContentPane().setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font1 = new Font("d2cording", 1, 20);

		ImageIcon icon1 = new ImageIcon("diary.png");
		ImageIcon icon2 = new ImageIcon("rogin.gif");
		ImageIcon icon3 = new ImageIcon("reset.png");

		JLabel top = new JLabel();
		top.setIcon(icon1);
		JLabel id = new JLabel("아  이  디 : ");
		JLabel pw = new JLabel("패  스  워  드 : ");
		id.setFont(font1);
		pw.setFont(font1);

		JTextField idtext = new JTextField(10);
		idtext.setFont(font1);
		JTextField pwtext = new JTextField(10);
		pwtext.setFont(font1);

		JButton login = new JButton();
		login.setIcon(icon2);
		login.setBackground(Color.green);
		JButton reset = new JButton();
		reset.setIcon(icon3);
		login.setBackground(Color.green);

		// 1) 버튼에 액션기능을 add
		// 2) 클릭했을 때 어떤 부품이 처리를 담당할 지 new로 하나 만들어주세요.
		// 3) 클릭했을 때 어떻게 처리할지를
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 넣었을때 idtext와 pwtext에 공백을 넣어라
				idtext.setText("");
				pwtext.setText("");

			}
		}); // reset add end

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 넣었을때 idtext와 pwtext에 공백을 넣어라
				// idtext, pwtext에 getText()
				String id2 =idtext.getText();
				String pw2 =pwtext.getText();
				if (id2.equals("root")  && pw2.equals("1234") ) {
					JOptionPane.showMessageDialog(f, "로그인완료");
					일기장쓰기 diary = new 일기장쓰기();
					diary.open();
				}else {
					JOptionPane.showMessageDialog(f, "로그인실패");
					
				}
				
				

			}
		}); // login add end

		f.add(top);
		f.add(id);
		f.add(idtext);
		f.add(pw);
		f.add(pwtext);
		f.add(login);
		f.add(reset);

		f.setVisible(true);

	}
}
