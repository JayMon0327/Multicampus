package 자바DB연결;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 

public class BBSDAO {
	
	public void delete(String content) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con =DriverManager.getConnection(url, user, password);
			
			System.out.println("2.오라클 연결 성공.");

			// 3번 시작 
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품 조립식이여서 ,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			//SQL부품으로 만들어 주어야 함.
			//preparedStatement가 SQL 부품 !!
			String sql = "delete from hr.BBS where content= ?";
			PreparedStatement ps = con.prepareStatement(sql); //con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			ps.setString(1, content);
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			//4번시작
			ps.executeUpdate();
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(String title, int no) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con =DriverManager.getConnection(url, user, password);
			 
			System.out.println("2.오라클 연결 성공.");

			// 3번 시작 
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품 조립식이여서 ,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			//SQL부품으로 만들어 주어야 함.
			//preparedStatement가 SQL 부품 !!
			String sql = "update hr.BBS set title = ? where NO= ? "; // 앞쪽에 있는게 1번 순서대로 !
			PreparedStatement ps = con.prepareStatement(sql); //con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			ps.setString(1, title);
			ps.setInt(2,no);
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");
			
			//4번시작
			ps.executeUpdate(); //insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//public void add2() {
	public void insert(String no,String title,String content, String writer) { 
		// insert 로 보내준 데이터값 id,pw,name,tel을 받기위해 미리 스트링 자리 만듬)
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1.오라클과 자바 연결할 부품 설정 성공.");
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con =DriverManager.getConnection(url, user, password);
			 
			System.out.println("2.오라클 연결 성공.");

			// 3번 시작 
			//ipaddress ==> InetAddress
			//String url = "http://www.naver.com";
			//URL u = new URL(url);
			//자바는 부품 조립식이여서 ,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			//SQL부품으로 만들어 주어야 함.
			//preparedStatement가 SQL 부품 !!
			String sql = "insert into hr.BBS values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); //con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			//con 부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//R빼고, 인덱스 0부터 시작!!
			//유일하게 db는 인덱스가 1부터 시작 !! 
			ps.setString(1, no);
			ps.setString(2, title);
			ps.setString(3, content);
			ps.setString(4, writer);
			//==> insert into hr.member values('a','a','a','a');
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.성공");
			
			
			//4번시작
			ps.executeUpdate(); //insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
