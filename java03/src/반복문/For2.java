package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
	for (; ;) { //무한루프(반복) , while(true) 반복문은 for문과 while문이 있음
		System.out.println("잘쓰지않음");
		String data = JOptionPane.showInputDialog("종료할까요??");
		// == 연산자는 기본데이터만 비교 가능
		// String은 기본데이터가 아니다 String부품에서 제공하는 기능을 사용해서 비교해주어야함
		if (data.equals("y")) {
			System.out.println("안녕히가세요!!");
			break; // if는 원래 브레이크를 가지고 있으니 이건 for 문의 break ! 
		}
		
	}
			
		

	}

}
