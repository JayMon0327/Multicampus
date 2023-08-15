package 메서드연습;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력값반환값체크 {

	public static void main(String[] args) {
		Random r = new Random();
		int data1 = r.nextInt(5); //return 0~4, 3
		String data2 = JOptionPane.showInputDialog("이름 입력"); //String으로 return
		JOptionPane.showMessageDialog(null, data2); //void타입 리턴이 없기때문에 데이터 저장이 안됨 //String data3 = 붙이면 오류 
	}

}
