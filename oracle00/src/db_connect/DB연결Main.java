package db_connect;



import javax.swing.JOptionPane;

public class DB����Main {

	public static void main(String[] args) throws Exception {
	
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		DAO dao = new DAO();
		//dao.insert(id, pw, name, tel);
	}
}
