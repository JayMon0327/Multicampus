package test;

public class Car2 {
	public static Car2 car2;
	// car2의 값이 null이면 아직 객체가 안만들어졌다라는 의미
	// car2의 값이 주소가 들어있으면 객체를 만들어서 램에 넣어뒀다는 의미

	//외부에서 Car2객체를 생성못하게 막아버리자.
	private Car2() {
	}
	public static Car2 getInstance() {
		//객체가 이미 만들어졌는지 확인해보고
		//null이면 하나 만들자.
		//null이 아니면 만들어진 것 리턴하자.
		if (car2 == null) {
			car2 = new Car2();
		}
		return car2;
	}
}
