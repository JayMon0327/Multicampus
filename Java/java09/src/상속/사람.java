package 상속;

public class 사람 extends Object { // object은 모든것의 꼭대기에 있기 때문에 extends object굳이 써줄필요가 없음
		//사람의 기본적인 성질 --> 멤버변수
		String name;
		int age;
		
		//사람의 동작 --> 멤버메서드
		public void eat() {
			System.out.println("먹다");
		}
		public void sleep() {
			System.out.println("잠자다.");
			
		}
		@Override
		public String toString() {
			return "사람 [name=" + name + ", age=" + age + "]";
		}
		
		
}
