package 상속확인문제;

public class 내차들 {

	public static void main(String[] args) {
		coffeeTruck mycar = new coffeeTruck();
		mycar.run();
		mycar.booster();
		mycar.move();
		mycar.cm = "200";
		mycar.speed = "300";
		mycar.weight = 300;
		
		
		System.out.println(mycar);

	}

}
