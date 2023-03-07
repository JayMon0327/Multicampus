package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		// 실행해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("번호/제목/요일/작성자 순으로 입력하세요.");
		
		String no = sc.next();
		String title = sc.next();
		String content= sc.next();
		String writer = sc.next();
		BBSDAO dao = new BBSDAO(); //다오 페이지를 불러온
		dao.insert(no, title, content, writer); //다오에 insert로 값들을 보낸다.
		//다오에게 데이터를 주고 다오가 실행하는 것이기 때문에 회원가입이 먼저
		
		

	}

}
