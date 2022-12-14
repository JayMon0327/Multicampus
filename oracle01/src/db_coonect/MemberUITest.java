package db_coonect;

import javax.swing.JOptionPane;

public class MemberUITest {

	public static void main(String[] args) {
		//입력하는 화면을 ui파일에 만들자..
		
		String id = JOptionPane.showInputDialog("아이디 입력"); 
		String pw = JOptionPane.showInputDialog("패스워드 입력"); 
		String name = JOptionPane.showInputDialog("이름 입력"); 
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		//입력한 데이터를 가지고 db에 넣읍시다.!!
		//db의 member테이블에 넣고 싶어요!!!
		//==> MemberDAO사용하면 됨.
		MemberDAO dao = new MemberDAO();
		//dao.insert(id, pw, name, tel);
		
	}

}
