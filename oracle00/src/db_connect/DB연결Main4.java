package db_connect;

import javax.swing.JOptionPane;

public class DB연결Main4 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("검색할 id");
		DAO dao = new DAO();
		MemberVO bag = dao.one(id);
		System.out.println("db검색 결과 " + bag);
		System.out.println("db검색 결과 id>> " + bag.getId());
		System.out.println("db검색 결과 pw>> " + bag.getPw());
		System.out.println("db검색 결과 name>> " + bag.getName());
		System.out.println("db검색 결과 tel>> " + bag.getTel());
	}

}
