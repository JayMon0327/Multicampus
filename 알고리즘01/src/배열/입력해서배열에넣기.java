package 배열;

import java.util.Scanner;

public class 입력해서배열에넣기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // system.in은 키보드를 의미한다.
		//자바프로그램과 콘솔(키보드)를 스트림(강물)을 오픈
		int[] numbers = new int[3]; // {0,0,0} -> {11,22,33}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			//입력받아서 int로 바꾼후, 배열에 넣어라 ! 
			//위에 numbers 3 이니까 3번 입력받는다.
		}
		sc.close(); 
		for (int x : numbers) {
			System.out.println(x);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]==33) {
				System.out.println(("위치는 "+ i ));
			}
		}
		
		
		
		
		
	}

}
