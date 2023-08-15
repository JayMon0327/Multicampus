package 상속;

public class 우먼 extends 사람 {
	int light;
	
	public void punch() {
		System.out.println("펀치가 쎄다");
	}

	public 우먼(int light) {
		super();
		this.light = light;
	}
}
