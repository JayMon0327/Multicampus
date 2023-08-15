package 클래스만들기;

public class 계산기사용가게 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		cal.add();
		
		
		//Tv부품을 사용해서, 켜보기도 하고, 꺼보세요.!
		TV tv1 = new TV();
		tv1.on();
		TV tv2 = new TV();
		tv2.on();
		tv2.off();
	}

}
