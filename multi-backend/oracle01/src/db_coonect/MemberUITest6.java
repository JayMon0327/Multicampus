package db_coonect;

import javax.swing.JOptionPane;

public class MemberUITest6 {

	public static void main(String[] args) {
		//입력하는 화면을 ui파일에 만들자..
		//로그인 기능!!
		String id = JOptionPane.showInputDialog("아이디 입력"); 
		String pw = JOptionPane.showInputDialog("패스워드 입력"); 
		
		MemberDAO dao = new MemberDAO();
		
		//보내는 쪽
		//1) 가방을 만든다.
		MemberVO bag = new MemberVO();
		
		//2) 가방에 입력한 값들을 넣자.(set()이용)
		bag.setId(id);
		bag.setPw(pw);
		//name, tel은 null이 들어가있는 상태
		
		//3) 가방을 DAO에게 전달
		int result = dao.login(bag); //1이면 성공, 0이면 실패
		if (result == 1) {
			JOptionPane.showMessageDialog(null, "로그인 성공");
			BbsUI6 bbs = new BbsUI6();
			bbs.open();
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패");
			MemberUI6 member = new MemberUI6();
			member.open();
		}
	}
}






