package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {

	public MemberVO one(String id) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// 마이바티스
		// 1. 드라이버(커넥터) 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");

		// 2. db연결(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");

		// 3. sql문 생성
		String sql = "selecy * where id = ? ";
		// SQL문장을 담당하는 객체로 만들어주어야 자바는 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문 생성 ok....");

		// 4. sql문 전송
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 ok....");

		// 5. Java(ResultSet) <--- oracle(검색 결과 table)
		String id2 = rs.getString(1);
		String pw = rs.getString(2);
		String name = rs.getString(3);
		String tel = rs.getString(4);

		// 6. 1)가방을 만들어, 2)데이터를 넣어, 3)전달(반환, return)
		// 1). 가방을 만든다.
		MemberVO bag = new MemberVO();

		// 2). 가방에 데이터를 하나씩 넣자.
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);

		ps.close();
		con.close();
		
		// 3).가방을 전달하자.
		return bag;
	}

	public void delete(String id) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// 마이바티스
		// 1. 드라이버(커넥터) 설정
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");

		// 2. db연결(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3306/school?useUnicode=true&serverTimezone=Asia/Seoul";
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");

		// 3. sql문 생성
		String sql = "delete from member where id = ? ";
		// SQL문장을 담당하는 객체로 만들어주어야 자바는 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.println("3. SQL문 생성 ok....");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok....");

		ps.close();
		con.close();
	}

	public void insert(MemberVO bag) throws Exception {
		// 1~3: apache iBatis-> google myBatis
		// 마이바티스
		// 1. 드라이버(커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 ok....");

		// 2. db연결(shop, root, 1234)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 ok....");

		// 3. sql문 생성
		String sql = "insert into member values (?,?,?,?)";
		// String sql = "delete from member where id = '700' ";
		// SQL문장을 담당하는 객체로 만들어주어야 자바는 인식
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId());
		ps.setString(2, bag.getPw());
		ps.setString(3, bag.getName());
		ps.setString(4, bag.getTel());

		System.out.println("3. SQL문 생성 ok....");

		// 4. sql문 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 ok....");

		ps.close();
		con.close();
	}

}
