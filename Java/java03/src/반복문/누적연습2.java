package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
//		1. 숫자 누적
//		5부터 300까지 5의 배수만 모두 더해 출력해보세요.!
//		5의 배수 조건 --> (i % 5 == 0)
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 ==0) {
				sum = sum+ i;
				
				
			}
			
			
		
		}
		System.out.println("전체 더한 값은?" +sum);
		
		//2. 문자누적
		String sum2 = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("감자, 고구마 , 양파, 딸기");
			sum2 = sum2 + data + "랑 ";
			
			
		} System.out.println(sum2);
	}

}
