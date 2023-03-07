package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		// 실행해보자
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 제목을 입력후 수정제목의번호를 순서대로 입력");
		
		String title = sc.next();
		int no = sc.nextInt();
		BBSDAO dao = new BBSDAO(); //다오 페이지를 불러온
		dao.update(title,no); //다오에 insert로 값들을 보낸다.
		//다오에게 데이터를 주고 다오가 실행하는 것s이기 때문에 회원가입이 먼저
		
		

	}

}
