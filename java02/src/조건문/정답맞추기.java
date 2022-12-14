package 조건문;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		int target = 88;
		int no = 0;//틀린 횟수
		int count = 0; //전체 횟수
		while (true) {
			String data = JOptionPane.showInputDialog("숫자입력");
			int data2 = Integer.parseInt(data);
			// 비교연산자는 기본형 데이타만 사용할 수 있다.
			count++;
			if (data2 == target) {
				System.out.println("정답입니다. 축하합니다.");
				break;
			} else {
				no++;
				System.out.println("정답이 아닙니다.!!");
				// 큰지, 작은지 힌트를 주세요.!
				if (data2 > target) {
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요");
				}//else
			}//if
		}//while
		System.out.println("전체 시도 횟수: " + count + "회");
		System.out.println("틀린 시도 횟수: " + no + "회");
	}//main

}//class
