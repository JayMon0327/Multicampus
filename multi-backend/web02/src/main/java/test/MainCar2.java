package test;

public class MainCar2 {

	public static void main(String[] args) {
		//Car2 car1 = new Car2(); //private!!
	
		Car2 car1 = Car2.getInstance();
		System.out.println(car1);
		Car2 car2 = Car2.getInstance();
		System.out.println(car2);
		
		//싱글톤으로 사용하는 클래스는
		//한번 싱글톤으로 만들어주고 서버에서 계속 가지고 있는 클래스
		//DAO, 서블릿(<---jsp)
	}

}
