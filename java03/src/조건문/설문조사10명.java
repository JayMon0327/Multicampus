package 조건문;

import java.io.ObjectInputStream.GetField;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		// 10명에게 배부른가요?? 물어봐서 !!
		// 배부르다고 한 사람, 안부르다고 한 사람 몇 명 카운트
		int full = 0; //배보
		int nofull = 0; //안배보
		for (int i = 0; i < 10; i++) {
			
			String data = JOptionPane.showInputDialog("배부른가요?(1번 배부름 2번 배고픔");
			if (data.equals("1")) {
//				full = full + 1; // 0+1  - 아래랑 같은 코드. 축약
				full++;
				
			}else if (data.equals("2")) {
				nofull++;
				
			}
			System.out.println("배부른 사람 몇명?" + full + "명");
			System.out.println("배고픈 사람 몇명?" + nofull + "명");
			
		}

	}

}
