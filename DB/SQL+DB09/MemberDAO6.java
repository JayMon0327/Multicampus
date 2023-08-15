package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import 화면DB연결.MemberVO;

public class MemberDAO6 { //CRUD

	//메서드를 만드는 것 ==> 메서드 정의(define)!
	//메서드를 정의했다고 실행되는 것은 아니다.!
	//메서드를 쓰는 것 ==> 메서드 호출(call)!
	public ArrayList<MemberVO> list() {
		ResultSet rs = null; // ResultSet 테이블을 나타내는 부품! 
		//가방들 넣어줄 큰 컨테이너 역할을 부품이 필요 ! 
		//ArrayList<MemberVO> --> MemberVO만 들어간 ArrayList라는 의미
		ArrayList<MemberVO> list = new ArrayList<>();
		MemberVO bag = null;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			rs = ps.executeQuery(); //executeUpdate는 결과가 정수인것만 가능
			//select문 전송시 executeQuery row 값이 아니라서 설정
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			while(rs.next()) { //검색결과가 있는지 여부는 rs.next()
				//true 이면 있다라는 의미, false이면 없다라는 의미 
				//1. 검색 결과가 있으면
				//2. 각 컬럼에서 꺼내오자
//				System.out.println("검색결과있음.성공");
				String id2 = rs.getString(1); //id
				String pw = rs.getString(2); //pw
				String name = rs.getString(3); //name
				String tel = rs.getString(4); //tel
//				System.out.println(id2+" "+pw+" "+name+" "+tel);
				//3.가방을 만들자
				bag=new MemberVO();
				bag.setId(id2);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);
				
				//4. list에 bag을 추가해주자
				list.add(bag);
			}
			ps.close();
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//id,pw,name,tel
		//return 뒤에는 반드시 여러데이터를 묶어서 리턴 해주어야 함
		//검색결과가 없을 때는 bag에 무엇이 들어있나 ? null 
		return list;
		
	}
	
	public int update(MemberVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "update hr.MEMBER set tel = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTel());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			//insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("수정 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//public void add2() {
	public int insert(MemberVO bag) {//가방을 받아서
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			//public void insert(String id, String pw, String name, String tel) 
			String sql = "insert into hr.MEMBER values (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//R빼고, 인덱스 0부터 시작!!
			//유일하게 db은 인덱스가 1부터 시작!!
			//2. 가방에서 값들을 하나씩 꺼내쓰세요.
			ps.setString(1, bag.getId()); 
			ps.setString(2, bag.getPw());
			ps.setString(3, bag.getName());
			ps.setString(4, bag.getTel());
			//==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("회원가입 성공!");
			}
			//System.out.println(result);
		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			//result = 0;
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}
	public int login(MemberVO bag) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.MEMBER where id = ? and pw = ?";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1,bag.getId());
			ps.setString(2,bag.getPw());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			ResultSet rs = ps.executeQuery(); //executeUpdate는 결과가 정수인것만 가능
			//select문 전송시 executeQuery row 값이 아니라서 설정
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(rs.next()) { //검색결과가 있는지 여부는 rs.next()
				//true 이면 있다라는 의미, false이면 없다라는 의미 
				System.out.println("검색결과있음.성공");
				result = 1;
				
				
			}else {
				System.out.println("검색결과없음.실패");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int delete(String id) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "delete from hr.MEMBER where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("탈퇴 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
}

