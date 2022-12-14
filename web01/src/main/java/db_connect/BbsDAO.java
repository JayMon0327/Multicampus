package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BbsDAO {

	public ArrayList<BbsVO> list() {

		// vo를 넣어줄 커다란 박스역할을 할 수 부품을 사용 예정
		// 가변길이인 경우 arraylist
		// BbsVO가 많이 들어간 arraylist박스를 하나 만들어줌.
		ArrayList<BbsVO> list = new ArrayList<>();

		// 1. 드라이버 설정- 드라이버(커넥터) 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");

			// 2. db연결 mySQL: school, oracle: xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@@");

			// 3. sql문을 만든다.
			String sql = "select * from BBS";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql문 생성 성공.@@@@@");

			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
			ResultSet rs = ps.executeQuery(); // r의 결과는 table, cud는 숫자(실행된row수) //1
			// rs.next() true면 결과가 있음. false면 결과가 없음.
			// System.out.println("4. sql문 db서버로 전송 성공. @@@@@ 반영된 row수 >>" + rs.next());
			while (rs.next()) { // 결과값이 true이면!!
				System.out.println("검색결과가 있음.");
				// 있으면
				// 1. 한 행의 값들을 추출
				// 2. vo를 만들어준다.
				// 3. vo에 추출한 값들을 넣어준다.
				// 4. vo를 list에 넣어준다.
				int no = rs.getInt(1); // 컬럼의 순서 1번 id값 추출
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);

				// UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
				// 4개의 데이터를 UI에게 return!!해주자.
				// 1) 가방을 만들어서,
				BbsVO bag = new BbsVO();
				// 2) 데이터를 넣고,
				bag.setNo(no);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);

				list.add(bag);
				// 3) return하자.(전달)
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
	
	//기능하나만 메서드 하나 구현(검색 1명 기능-row 1개)
		public BbsVO one(int no) {
			//전달된 값 제대로 전달되었는지 확인하는 습관이 좋음.
			System.out.println(no);
			
			//1. 드라이버 설정- 드라이버(커넥터) 로딩
			//   db의 유형, 버전에 따라 매우 많음.
			//   필요할 때 다운로드 받아 써야 함.
			BbsVO bag = null; //쓰레기값!!--> 변수 초기화시켜주어야함.!
			
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
				String sql = "select * from BBS where \"" + "no\"  = ?"; 
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, no); //1번 물음표에 id에 저장해놓은 값을 스트링으로 넣어줘!
				System.out.println("3. sql문 생성 성공.@@@@@");
				//String site = "http://www.naver.com";
				//Url url = new Url(site); //객체화!!
				
				//4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
				ResultSet rs = ps.executeQuery(); // r의 결과는 table, cud는 숫자(실행된row수) //1 
				//rs.next() true면 결과가 있음. false면 결과가 없음.
				//System.out.println("4. sql문 db서버로 전송 성공. @@@@@ 반영된 row수 >>"  + rs.next());
				if (rs.next()) { //결과값이 true이면!!
					System.out.println("검색결과가 있음.");
					int no2 = rs.getInt(1); //컬럼의 순서 1번 no값 추출
					String title = rs.getString(2);
					String content = rs.getString(3);
					String writer = rs.getString(4);
					System.out.println("검색한 결과>>" + 
													no2 +" " + 
													title + " " + 
													content + " " +
													writer);
					
					//UI에서 사용자가 검색한 결과를 볼 수 있어야 한다.
					//4개의 데이터를 UI에게 return!!해주자.
					//1) 가방을 만들어서,
					bag = new BbsVO();
					//2) 데이터를 넣고,
					bag.setNo(no2);
					bag.setTitle(title);
					bag.setContent(content);
					bag.setWriter(writer);
					
					//3) return하자.(전달)
				}
				//db처리와 관련된 메모리 할당된 것 해제시켜주자.
				ps.close();
				con.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			//메서드의 처리를 다 끝내고, 결과를 보내줘라는 개념. 맨 끝에 써야함.
			return bag;
		} //one
} //class
