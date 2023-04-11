package 프로그래머스;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean result = sc.next().equals("hong");//체인식 코딩! - 코드가 옆으로 길어지기 때문에 실무에서 권장하지않음.
		String s = sc.next();
		boolean result2 = s.equals("hong");
		System.out.println(result);

	}

}
