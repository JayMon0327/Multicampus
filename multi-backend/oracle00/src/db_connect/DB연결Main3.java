package db_connect;

import javax.swing.JOptionPane;

public class DB����Main3 {

	public static void main(String[] args) throws Exception {
	
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		DAO dao = new DAO();
		
		//�ϳ��� �����͸� dao�� �������� ����, ������ ����� �־, ������ ��������.
		//1.  ������ �����.
		MemberVO bag = new MemberVO();
		
		//2. ���濡 �����͸� �ϳ��� ����.
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		//3.������ ��������.
		dao.insert(bag);
	}
}
