package db_coonect;

import java.util.ArrayList;

public class MemberUIList {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVO> list = dao.list();
		for (MemberVO bag : list) { //9
			System.out.println(bag.getId());
			System.out.println(bag.getPw());
			System.out.println(bag.getName());
			System.out.println(bag.getTel());
			System.out.println("----------------");
		}
		String[][] all = new String[list.size()][4];
		//java기본 (배열)
		
	}

}
