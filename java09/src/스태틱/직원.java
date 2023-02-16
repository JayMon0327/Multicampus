package 스태틱;

public class 직원 {
	String 이름;
	int 나이;
	String 성별;
	static int count;
	static int age;
	
	//객체생성하지않고 클래스이름으로 바로 접근해서 아무때나 원할 때 평균을 구하고 싶은 경우
	//static메서드로 만들어주세요.!
	public static void getAvg() {
		//!!!  static메서드에서 전역변수를 접근할 때는
		//		같은 성격을 가진 static변수만 접근이 가능!!!
		//System.out.println(이름); ( X )
		System.out.println(age /count);
	}
	public 직원(String 이름, int 나이, String 성별) {
		count++;
		age = 나이+age;
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
	}
	@Override
	public String toString() {
		return "직원 [이름=" + 이름 + ", 나이=" + 나이 + ", 성별=" + 성별 + "]";
	}
	
	
	
}
