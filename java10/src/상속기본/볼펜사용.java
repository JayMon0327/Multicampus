package 상속기본;

public class 볼펜사용 {

	public static void main(String[] args) {
		볼펜서브 볼펜1 = new 볼펜서브();
		볼펜1.가격 = 1000;
		볼펜1.두께 = 2000;
		볼펜1.학용품 = "사무용품";
		볼펜1.회사 = "모나미";
		볼펜1.글을쓰다();
		볼펜1.사다();
		System.out.println(볼펜1);
	}

}
