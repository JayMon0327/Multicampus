package 반복문;


import java.awt.peer.SystemTrayPeer;

import javax.swing.JOptionPane;

//! ==> not
public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트!!
		for (int i = 0; i < 11; i++) {
			if (i % 2 !=0) {
				continue; // skip 이라는 뜻.
			} else if (i > 8) {
//				break;
				System.exit(0); // 이 함수 뒤로는 모든 프로그램 종료 (class전체 프로그램 말하는것)
								// 0 : 정상종료
								// 0이 아닌 다른 값 : 비정상 종료
			}
			System.out.println(i);
		}

	}

}
