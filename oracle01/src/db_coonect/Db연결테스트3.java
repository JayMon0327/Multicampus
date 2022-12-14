package db_coonect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Db연결테스트3 {

	public static void main(String[] args) {
		//자바에서 DBMS를 연결하려고 함.
		//JDBC 프로그래밍 절차
		//4단계 절차
		//1. 드라이버 설정- 드라이버(커넥터) 로딩
		//   db의 유형, 버전에 따라 매우 많음.
		//   필요할 때 다운로드 받아 써야 함.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");
			
			
			//2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger"; 
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. db연결 성공.@@@@@@");
			
			//3. sql문을 만든다. 
			String sql = "insert into member values ('ice2','ice2','ice2','ice2')"; 
			//준비된 문장(Preparedstatement)
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성 성공.@@@@@");
			//String site = "http://www.naver.com";
			//Url url = new Url(site); //객체화!!
			
			//4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
			int result = ps.executeUpdate(); // r의 결과는 table, cud는 숫자(실행된row수) //1 
			System.out.println("4. sql문 db서버로 전송 성공. @@@@@ 반영된 row수 >>"  + result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		
		
		
		
		
		
	}

}
