package 상속;

public class 원더우먼 extends 우먼 {
	boolean swim;

	public void 잠수하다() {
		System.out.println("심해에서 10시간 버터버려");
		System.out.println("내이름은 "+name);
	}
	@Override
	public void eat() {
		System.out.println("심해에서 밥을 먹어버려");
	}
	@Override
	public String toString() {
		
		return "원더우먼 [swim=" + swim + ", light=" + light + ", name=" + name + ", age=" + age + "]";
	}
}


