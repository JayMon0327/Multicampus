package db_coonect;

import javax.swing.JOptionPane;

public class MemberUITest4 {

	public static void main(String[] args) {
		//입력하는 화면을 ui파일에 만들자..
		
		String id = JOptionPane.showInputDialog("검색할 아이디 입력"); 
		
		//입력한 데이터를 가지고 db에 넣읍시다.!!
		//db의 member테이블에 넣고 싶어요!!!
		//==> MemberDAO사용하면 됨.
		MemberDAO dao = new MemberDAO();
		MemberVO bag = dao.one(id); //메서드이름위에서 컨트롤 +클릭하면 one() 원본으로 이동!! MemberVO
		JOptionPane.showMessageDialog(null, bag);
	}
}
