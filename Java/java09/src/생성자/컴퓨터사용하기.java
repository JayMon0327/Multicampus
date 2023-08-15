package 생성자;

public class 컴퓨터사용하기 {

	public static void main(String[] args) {
		컴퓨터조립 내컴 = new 컴퓨터조립(10000, "APPLE", 30);
		컴퓨터조립 마컴 = new 컴퓨터조립(20000, "BANANA", 20);
		System.out.println(내컴);
		System.out.println(마컴);
		
		

	}

}
