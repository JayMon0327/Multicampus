package 자바DB연결;

import java.util.Scanner;



import 화면DB연결.MemberVO;

public class 회원1명검색 {

	public static void main(String[] args) {
		// 실행해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 id를 입력");
		
		String id = sc.next();
		
		MemberDAO5 dao = new MemberDAO5(); //다오 페이지를 불러온
		
		MemberVO bag = dao.one(id);
		String total = bag.getId()+", "+ bag.getPw()+", "+bag.getName()+", "+bag.getTel();
		
		
		

	}

}
