package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 

@Component
public class BookDAO {

	
	public BookVO select(String name) {
		ResultSet rs = null;
		BookVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. MySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. MySQL 연결 성공.");

			// 3번 시작
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품 조립식이여서 ,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어 주어야 함.
			// preparedStatement가 SQL 부품 !!
			String sql = "select * from book where name= ?";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			ps.setString(1,name);
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			// 4번시작
			rs = ps.executeQuery();
			System.out.println("4.SQL문 오라클로 보내기 성공.");
			if (rs.next()) { // 검색결과가 있는지 여부
				System.out.println("검색결과있음. 성공");
				String name2 = rs.getString(2);
				String url2 = rs.getString(3);
				String img = rs.getString(4);
				System.out.println(name2 + ", " + url2 + ", " + img );
				bag = new BookVO();
				bag.setName(name2);
				bag.setUrl(url2);
				bag.setImg(img);
			} else {
				System.out.println("검색결과 없음");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} //
		return bag;
	}// one

	public void update(BookVO bag) {
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. MySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. MySQL 연결 성공.");

			// 3번 시작
			// ipaddress ==> InetAddress
			// String url = "http://www.naver.com";
			// URL u = new URL(url);
			// 자바는 부품 조립식이여서 ,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어 주어야 한다.
			// SQL부품으로 만들어 주어야 함.
			// preparedStatement가 SQL 부품 !!
			String sql = "update book set url = ? where name= ? "; // 앞쪽에 있는게 1번 순서대로 !
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			ps.setString(1, bag.getUrl());
			ps.setString(2, bag.getName());
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			// 4번시작
			ps.executeUpdate(); // insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int delete(String name) {

		int result = 0;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. MySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. MySQL 연결 성공.");

			String sql = "delete from book where name = ? ";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setString(1, name);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");

			result = ps.executeUpdate();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if (result == 1) {
				System.out.println("탈퇴 성공.");
			}
			// System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;

	}

	public void insert(BookVO bag) {


		// insert 로 보내준 데이터값 id,pw,name,tel을 받기위해 미리 스트링 자리 만듬)

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. MySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. MySQL 연결 성공.");

			// 3번 시작
			// auto increment로 시퀀스적용 no값 부여 안해도 됨
			String sql = "insert into Book(name,url,img) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어

			ps.setString(1,bag.getName());
			ps.setString(2, bag.getUrl());
			ps.setString(3, bag.getImg());
			// ==> insert into hr.member values('a','a','a','a');
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.성공");

			// 4번시작
			ps.executeUpdate(); // insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<BbsVO> list() {
		ResultSet rs = null; // ResultSet 테이블을 나타내는 부품!
		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요 !
		// ArrayList<MemberVO> --> MemberVO만 들어간 ArrayList라는 의미
		ArrayList<BbsVO> list = new ArrayList<>();
		BbsVO bag = null;

		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. MySQL과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); // 맥 locale에러나신 분들만!!!

			// 2.오라클 11g에 연결해보자.(java --- oracle)
			String url = "jdbc:mysql://localhost:3306/multi?serverTimezome=UTC";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			// String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개
			System.out.println("2. MySQL 연결 성공.");

			// ipaddress ==> InetAddress
			// String url = "http://wwww.naver.com";
			// URL u = new URL(url);
			// 자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			// 특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			// SQL부품으로 만들어주어야 함.
			// PreparedStatement가 SQL부품!!

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			rs = ps.executeQuery(); // executeUpdate는 결과가 정수인것만 가능
			// select문 전송시 executeQuery row 값이 아니라서 설정
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while (rs.next()) { // 검색결과가 있는지 여부는 rs.next()
				// true 이면 있다라는 의미, false이면 없다라는 의미
				// 1. 검색 결과가 있으면
				// 2. 각 컬럼에서 꺼내오자
//				System.out.println("검색결과있음.성공");
				int no2 = rs.getInt(1); 
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(no2 + ", " + title + ", " + content + ", " + writer);
				bag = new BbsVO();
				bag.setNo(no2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				// 4. list에 bag을 추가해주자
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// id,pw,name,tel
		// return 뒤에는 반드시 여러데이터를 묶어서 리턴 해주어야 함
		// 검색결과가 없을 때는 bag에 무엇이 들어있나 ? null
		return list;

	}
}
