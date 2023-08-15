package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
//		=> String비교(비교연산자 사용불가)
//				먹고 싶은 음식: 아이스크림
//
//				아이스크림이면 뚜레주르로 가요
//				아이스커피이면 이디야로 가요
//				다른 것이면 물마셔요

		//입력
		String food = JOptionPane.showInputDialog("먹고 싶은 음식");
		//처리
		String result = "";
		if (food.equals("아이스크림")) {
			result = "뚜레주르로 가요";
		}else if (food.equals("아이스커피")) {
			result = "이디야로 가요";
		}else {
			result = "물먹어요";
		}
		//출력
		System.out.println(result);
	}

}
