package 인터페이스;

public class 컴퓨터사용2 {

	public static void main(String[] args) {
	//익명클래스!!
		//computer com = new computer();
		//인터페이스는 불완전 하기 때문에 이것을 틀로해서 객체생성 불가능!!
		컴퓨터 컴퓨터 = new 컴퓨터() { // 컴퓨터 인터페이스를 구체적으로 구현한 이름없는 클래스를 가지고 객체 생성함. --> 익명클래스
			
			@Override
			public void 케이스를튼튼하게만들다() {
			
				
			}
			
			@Override
			public void 네모나게만들다() {
			
				
			}
		};
	}

}
