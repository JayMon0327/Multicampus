package 반복문;

public class 반복문4 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 100; i++) {
			//System.out.println(i % 2 == 0);
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}

}
