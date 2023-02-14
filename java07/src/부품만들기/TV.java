package 부품만들기;

public class TV {
	//멤버변수, 선언이 클래스 바로 아래에 되었기 때문에
	//클래스 전체 영역에서 이 변수를 사용할 수 있음.
	//전역변수(global변수, 글로벌 변수)
	//멤버변수는 자동 초기화, 전역변수는 자동초기화
	public int ch; //0
	public int vol; //0
	public boolean onOff; //false
	
	public void 채널을바꾸다() {
		int change = 1; //지역변수, local변수, 로컬변수, 자동초기화 X 
		System.out.println(ch + "에서"+change+"로 바꾸다.");
		
		
	}
	public void 유튜브보다() { //메서드 만드는것 => 메서드를 정의한다.
		System.out.println(vol+" 을 키워서 동영상을 보다.");
	}
}
