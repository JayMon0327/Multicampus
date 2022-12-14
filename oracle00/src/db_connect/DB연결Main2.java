package db_connect;

import javax.swing.JOptionPane;

public class DBø¨∞·Main2 {

	public static void main(String[] args) throws Exception {
	
		String id = JOptionPane.showInputDialog("id");
		DAO dao = new DAO();
		dao.delete(id);	
	}

}
