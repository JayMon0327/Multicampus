package 상속;

public class 사람{
	//멤버변수, 멤버메서드
	String name;
	int age;
	//파라메터있는 생성자를 정의하게 되면,
	//파라메터없는 기본 생성자는 자동으로 만들어지지 않습니다.
	//new 사람(); //불가
	public 사람(String name, int age) {
//		super(); 
		//Object(); 부모의 기본 생성자 호춫ㄹ
		this.name = name;
		this.age = age;
	}
	public void eat() {
		System.out.println("먹다.");
	}
	public void sleep() {
		eat(); //클래스내의 메소드는 자유롭게 호출 가능함.
		System.out.println("자다.");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
}
