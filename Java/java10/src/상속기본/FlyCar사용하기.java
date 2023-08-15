package 상속기본;

public class FlyCar사용하기 {

	public static void main(String[] args) {
		Flycar f = new Flycar();
		f.color = "red";
		f.fly = true;
		f.run();
		f.fly();
		System.out.println(f);

	}

}
