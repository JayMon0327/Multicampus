package 상속확인문제;

public class coffeeTruck extends Truck {
	int weight;
	public void move() {
		System.out.println("물건을 운반하다");
	}
	@Override
	public String toString() {
		return "coffeeTruck [weight=" + weight + ", cm=" + cm + ", speed=" + speed + "]";
	}

}
