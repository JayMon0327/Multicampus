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
import 자바DB연결.MemberDAO3;
import 자바DB연결.MemberDAO5;

public class MemberUI_login {

	public static void main(String[] args) {

		// 로그인 화면
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		MemberDAO5 dao = new MemberDAO5();
		MemberVO bag = new MemberVO();

		bag.setId(id);
		bag.setPw(pw);
		int result = dao.login(bag);
		if (result == 1) {
			System.out.println("로그인 성공");
			MemberUI4 ui = new MemberUI4();
			ui.open(null);
		} else {
			System.out.println("로그인 실패");
		}
	}
}