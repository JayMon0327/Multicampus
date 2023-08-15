package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DB연결2 {

	public static void main(String[] args) throws Exception {
		//1~3: apache iBatis-> google myBatis
			//				      마이바티스		
		//1. 드라이버(커넥터) 설정 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");
		
		//2. db연결(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");
		
		//3. sql문 생성
		String id = JOptionPane.showInputDialog("id");
		String pw = JOptionPane.showInputDialog("pw");
		String name = JOptionPane.showInputDialog("name");
		String tel = JOptionPane.showInputDialog("tel");
		
		String sql = "insert into member values (?,?,?,?)";
		//String sql = "delete from member where id = '700' ";
		//SQL문장을 담당하는 객체로 만들어주어야 자바는 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL문 생성 ok....");

		//4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok....");
	}

}
