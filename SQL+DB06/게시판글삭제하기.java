package 자바DB연결;

import java.util.Scanner;

public class 게시판글삭제하기 {

	public static void main(String[] args) {
		// 실행해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 content 입력하세요.");
		
		String content = sc.next();
		BBSDAO dao = new BBSDAO(); //다오 페이지를 불러온
		dao.delete(content); //다오에 insert로 값들을 보낸다.
		//다오에게 데이터를 주고 다오가 실행하는 것이기 때문에 회원가입이 먼저
		
		

	}

}
