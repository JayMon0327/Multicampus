package 인터페이스;

public interface 아이폰잭 {
//아이폰 잭이 되기 위한 규칙을 써줌.
	//기능중심으로 규칙을 정의:
	//함수(메서드)만 정의
	//메서드이름, 반환값, 입력값 규칙!
	//구체적인 구현은 쓰지 않고, 규칙만 정의함.
	//추상메서드, abstract(불완전)
	//abstract, public 생략가능! 
	//인터페이스는 무조건 public : 규칙이기 때문에 다 알려야 함.
	public void 납작하게만들다(); //추상메서드 -(구체적이지않다~ 추상적이다~)
	//public abstract void 납작하게만들다(); -> void 납작하게만들다(); 가능
	public void 이센치로만들다();
}
