package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.springframework.stereotype.Component;

//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 
@Component
public class ReplyDAO {

	
	public void update(ReplyVO bag) {
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
			String sql = "update reply set content = ? where no= ? "; // 앞쪽에 있는게 1번 순서대로 !
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어
			ps.setString(1, bag.getContent());
			ps.setInt(2, bag.getNo());
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.");

			// 4번시작
			ps.executeUpdate(); // insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void insert(ReplyVO bag) {


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
			String sql = "insert into reply(bbsno,content,writer) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // con부품으로 sql스트링에 있는 것 sql부품으로 만들어

			ps.setInt(1, bag.getBbsno());
			ps.setString(2, bag.getContent());
			ps.setString(3, bag.getWriter());
			// ==> insert into hr.member values('a','a','a','a');
			System.out.println("3.SQL문 부품(객체)으로 만들어주기.성공");

			// 4번시작
			ps.executeUpdate(); // insert, update, delete 문만 !! sql문 실행 결과가 int
			System.out.println("4.SQL문 오라클로 보내기 성공.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<ReplyVO> list(int bbsno) {
		ResultSet rs = null; // ResultSet 테이블을 나타내는 부품!
		// 가방들 넣어줄 큰 컨테이너 역할을 부품이 필요 !
		// ArrayList<MemberVO> --> MemberVO만 들어간 ArrayList라는 의미
		ArrayList<ReplyVO> list = new ArrayList();
		ReplyVO bag = null;

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

			
			//댓글은 특정 하나의 게시물에 대한 리스트 이므로
			//특성 게시물을 가지고 댓글 리스트를 가지고 와야 함.
			String sql = "select * from reply where bbsno = ?";
			PreparedStatement ps = con.prepareStatement(sql); // PreparedStatement
			ps.setInt(1, bbsno);
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
				int bbsno2 = rs.getInt(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				System.out.println(no2 + ", " + bbsno2 + ", " + content + ", " + writer);
				bag = new ReplyVO();
				bag.setNo(no2);
				bag.setBbsno(bbsno2);
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
