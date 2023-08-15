package com.multi.mvc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BookDAO {
	
	public ArrayList<BookDTO> list() {
		ArrayList<BookDTO> list = new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			String sql = "select * from book";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery(); // r의 결과는 table, cud는 숫자(실행된row수) //1
			while (rs.next()) { // 결과값이 true이면!!
				BookDTO bag = new BookDTO();
				bag.setId(rs.getInt(1));
				bag.setName(rs.getString(2));
				bag.setUrl(rs.getString(3));
				bag.setImg(rs.getString(4));

				list.add(bag);
			} // while
			System.out.println("box(list)에 들어간 가방의 갯수>> " + list.size());
			// db처리와 관련된 메모리 할당된 것 해제시켜주자.
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
		return list;
	} // list

	// 기능하나만 메서드 하나 구현(검색 1명 기능-row 1개)
	public BookDTO one(int id) {
		BookDTO bag = null; // 쓰레기값!!--> 변수 초기화시켜주어야함.!

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection

			String sql = "select * from book where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id); // 1번 물음표에 id에 저장해놓은 값을 스트링으로 넣어줘!

			ResultSet rs = ps.executeQuery(); // r의 결과는 table, cud는 숫자(실행된row수) //1
			if (rs.next()) { // 결과값이 true이면!!
				System.out.println("검색결과가 있음.");
				bag = new BookDTO();
				bag.setId(rs.getInt(1));
				bag.setName(rs.getString(2));
				bag.setUrl(rs.getString(3));
				bag.setImg(rs.getString(4));
			}
			// db처리와 관련된 메모리 할당된 것 해제시켜주자.
			ps.close();
			con.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
		return bag;
	} // one
	
	public void delete(int id) { // String id
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");

			// 2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");

			// 3. sql문을 만든다.
			String sql = "delete from book where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id); 
			System.out.println("3. sql문 생성 성공.@@@@@");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
			String result2 = "실패";
			try {
				int result = ps.executeUpdate(); // r의 결과는 table, cud는 숫자(실행된row수) //1
				System.out.println("4. sql문 db서버로 전송 성공. @@@@@ 반영된 row수 >>" + result);
				if (result == 1) {
					result2 = "성공";
				}
			} catch (Exception e) {
			}
			// JOptionPane.showMessageDialog(null, result2); //컴파일 에러
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // delete
	
	public void insert(BookDTO bag) { // String id
		System.out.println(bag); // toString()호출, 가방에 들어있는 값들이 프린트

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");

			// 2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:mysql://localhost:3306/school";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");

			// 3. sql문을 만든다.
			String sql = "insert into book values (null, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, bag.getName()); 
			ps.setString(2, bag.getUrl()); 
			ps.setString(3, bag.getImg()); 
			System.out.println("3. sql문 생성 성공.@@@@@");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
			String result2 = "실패";
			try {
				int result = ps.executeUpdate(); // r의 결과는 table, cud는 숫자(실행된row수) //1
				System.out.println("4. sql문 db서버로 전송 성공. @@@@@ 반영된 row수 >>" + result);
				if (result == 1) {
					result2 = "성공";
				}
			} catch (Exception e) {
				System.out.println("회원가입시 에러발생");
			}
			// JOptionPane.showMessageDialog(null, result2); //컴파일 에러
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // insert
} // class
