package 클래스만들기;

public class 내방 {

	public static void main(String[] args) {
		//. => 접근연산자
		휴대폰 p1 = new 휴대폰();
		//color, size, company 멤버변수 복사=> 자동초기화
		//p1변수 생성=>멤버변수들을 가르키는 주소가 들어감.
		System.out.println(p1.color);
		System.out.println(p1.size);
		p1.color = "흰색";
		p1.size = 7;
		p1.company = "삼성";
		System.out.println("p1휴대폰의 색은 " + p1.color);
		System.out.println("p1휴대폰의 크기는 " + p1.size);
		System.out.println("p1휴대폰의 회사는 " + p1.company);
		p1.문자하다();
		
		System.out.println("-----------------");
		휴대폰 p2 = new 휴대폰();
		p2.color = "빨강";
		p2.size = 11;
		p2.company = "애플";
		System.out.println("p2휴대폰의 색은 " + p2.color);
		System.out.println("p2휴대폰의 크기는 " + p2.size);
		System.out.println("p2휴대폰의 회사는 " + p2.company);
		p2.전화하다();
		
		
		
		
	}

}
