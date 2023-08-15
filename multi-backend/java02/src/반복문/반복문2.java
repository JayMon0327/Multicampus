package 반복문;

public class 반복문2 {

	public static void main(String[] args) {
		// 정해진 횟수만큼 반복해보자.
		int start = 1;//시작값
		int end = 5;//끝값
		int add = 1;//증가값
		while (start <= end) {
			System.out.println(start);
			start = start + add;
		}
	}

}
