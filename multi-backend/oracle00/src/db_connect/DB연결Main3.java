package db_connect;

import javax.swing.JOptionPane;

public class DB연결Main3 {

	public static void main(String[] args) throws Exception {
	
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		DAO dao = new DAO();
		
		//하나씩 데이터를 dao에 전달하지 말고, 가방을 만들어 넣어서, 가방을 전달하자.
		//1.  가방을 만든다.
		MemberVO bag = new MemberVO();
		
		//2. 가방에 데이터를 하나씩 넣자.
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		//3.가방을 전달하자.
		dao.insert(bag);
	}
}
