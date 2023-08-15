package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 s = new 수퍼맨("클라크", 1000, 10000, true);
		
		System.out.println(s); //
		//최종 재정의된 수퍼맨의 toString()이 호출됨.
		s.eat(); //사람
		s.run(); //맨
		s.space(); //수퍼맨
	}
}
