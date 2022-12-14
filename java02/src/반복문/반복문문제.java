package 반복문;

public class 반복문문제 {

	public static void main(String[] args) {
//	1)100부터 1까지 프린트!
		int start = 100;
		int end = 1;
		//int minus = 1;
		while (start >= end) {
			System.out.println(start);
			//start = start - minus;
			start--;//증감연산자
			
		}
		System.out.println("------");
//	2)5부터 10까지 프린트!
		int start2 = 5;
		int end2 = 10;
		//int add2 = 1;
		while (start2 <= end2) {
			System.out.println(start2);
			//start2 = start2 + add2;
			start2++;//증감연산자
		}
		System.out.println("------");
//	3)1부터 100까지 중 2씩 증가하면서 프린트!
		int start3 = 1;
		int end3 = 100;
		int add3 = 2;
		while (start3 <= end3) {
			System.out.println(start3);
			start3 = start3 + add3;
		}
	}

}
