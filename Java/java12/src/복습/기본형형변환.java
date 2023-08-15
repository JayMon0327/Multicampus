package 복습;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100; // 1바이트, -128~127
		int i1 = 200; // 4바이트, -21~21억
		
		i1 = b1; // 큰 <-- 작, 자동으로 형변환(자동형변환)
		
		b1 = (byte)i1; // 작 < -- 큰, 강제로 형변환(강제형변환)
		
		//double(큰,10.0) <- int(작,10)
		double d1 = i1; // 자동형변환
		i1 = (int)d1; //강제형변환
		int i2 = 2000;
		byte b2 = (byte)i2; //byte의 범위를 넘어선 127이상의 숫자는 강제형변환하면안됨. 
		//클래스 하나의 이름으로 다양한 이름의 값들을 사용함. 클래스단위의 다형성 - 오버라이딩
	}

}
