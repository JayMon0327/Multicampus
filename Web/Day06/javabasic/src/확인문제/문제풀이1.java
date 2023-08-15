package 확인문제;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 문제풀이1 {

	public static void main(String[] args) {
		//1. 입력
		String data = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String data2 = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		//2. 처리
		String result = "오늘 " + data + "수업 후 나는 " + data2 +"할 예정";
		
		//3. 출력
		System.out.println(result);
		
		int num1 = 30;
		int num2 = 40;
		
		System.out.println(num1+num2);
		
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
				

	}

}
