package 배열정리;

public class 참조형변수복사 {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		// int[] y = x; //주소 복사(얕은 복사)
		int[] y = x.clone(); // 주소가 가르키는 값의 리스트를 복사(깊은 복사)
		// 배열인 참조형 변수는 깊은 복사를 해야함.
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("--------------");
		x[0] = 9;
		System.out.print("x: ");
		for (int i : x) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("y: ");
		for (int i : y) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("깊은 복사 후 x: " + x);
		System.out.println("깊은 복사 후 y: " + y);

	}

}
