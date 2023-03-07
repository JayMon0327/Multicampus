package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		// 실행해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("id/pw/name/tel 순으로 입력하세요.");
		
		String id = sc.next();
		String pw = sc.next();
		String name= sc.next();
		String tel = sc.next();
		MemberDAO2 dao = new MemberDAO2(); //다오 페이지를 불러온
		dao.insert(id, pw, name, tel); //다오에 insert로 값들을 보낸다.
		//다오에게 데이터를 주고 다오가 실행하는 것이기 때문에 회원가입이 먼저
		
		

	}

}
