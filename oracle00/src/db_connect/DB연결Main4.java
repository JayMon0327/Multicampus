package db_connect;

import javax.swing.JOptionPane;

public class DB����Main4 {

	public static void main(String[] args) throws Exception {

		String id = JOptionPane.showInputDialog("�˻��� id");
		DAO dao = new DAO();
		MemberVO bag = dao.one(id);
		System.out.println("db�˻� ��� " + bag);
		System.out.println("db�˻� ��� id>> " + bag.getId());
		System.out.println("db�˻� ��� pw>> " + bag.getPw());
		System.out.println("db�˻� ��� name>> " + bag.getName());
		System.out.println("db�˻� ��� tel>> " + bag.getTel());
	}

}
