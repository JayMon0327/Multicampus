package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBConnect_ORACLE {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("1. 드라이버 설정 성공..");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공.");
		
		String sql = "insert into member9 values ('win', 'win', 'win', 'win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. sql문 객체 생성 성공.");
		
		int result = ps.executeUpdate();
		System.out.println("4. sql문 전송 성공, 결과>> " + result);
		
	}

}
