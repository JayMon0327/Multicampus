package 복습;

public class 직원 {
	public String name; // 같은 + 다른 패키지(아무데서나 접근가능)
	String address; //같은 패키지 접근가능
	protected int salary; // 같은패키지 + 다른패키지(상속할때만)
	
	private int rrn; //이 클래스 안에서만 !! 
	
	public int getRrn() {
		return rrn;
	}
}
