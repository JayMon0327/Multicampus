package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		// 계속 반복하고자 하는 경우
		while (true) {
			System.out.println("내가 계속 돌아요.");
			String choice = JOptionPane.showInputDialog("계속 하실래요? y)yes or n)no");
			if (choice.equals("n") || choice.equals("no")) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				//break;
				//while반복문을 종료, while아래에 있는 것들은 계속 실행
			}
		}
		//System.out.println("내가 실행될까요..");
		// 제한된 횟수를 반복하고자 하는 경우
//		int i = 0;//시작값
//		while (i < 10) {//조건식
//			System.out.println("내가 10번 돌아요.");//실행내용
//			i++;
//		}
	}

}
