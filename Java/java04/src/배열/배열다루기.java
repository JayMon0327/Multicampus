package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10]; //length: 10 // x까지 총 변수가 12개 만들어짐
//		// index는 0부터 시작, 마지막 위치의 index는 length(10)보다 하나 작다
//		// 0~9
//		System.out.println(x.length);
//		x[0] = 10;
//		x[1] = 20;
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print(x[i]+" ");
//		}
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);

		// 우리 가족의 성별을 char[]로 저장, 프린트
		// 우리 가족의 이름을 String[]로 저장, 프린트
		// 우리 가족의 시력을 Double[]로 저장, 프린트

		char[] gender = { '남', '남', '여', '남' };
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		String[] names = { "이후성 ", "이후영 ", "박선희 ", "이웅렬 " };
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
		}

		double[] sight = { 1.2, 1.4, 1.0, 0.8 };
		for (int i = 0; i < sight.length; i++) {
			System.out.print(sight[i] + " ");
		}
		boolean[] lunch = { true, false,true, false };
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
