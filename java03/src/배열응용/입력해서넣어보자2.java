package 배열응용;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		String[] data = new String[3];
		for (int i = 0; i < 3; i++) {
			data[i] = JOptionPane.showInputDialog("취미입력");
		}
		for (String x : data) {
			System.out.println(x);
		}
	}

}
