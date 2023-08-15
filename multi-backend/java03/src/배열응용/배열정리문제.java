package 배열응용;

import javax.swing.JOptionPane;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 6번
		int[] num6 = { 66, 77, 88, 99 };
		int imsi = num6[0]; //imsi <- 66
		num6[0] = num6[3]; //num6[0] <- 99
		num6[3] = imsi; //num6[3] <- imsi
		for (int x : num6) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// 5번
		int[] num5 = { 66, 77, 88, 99 };
		int max = num5[0];
		for (int i = 1; i < num5.length; i++) {
			if(max < num5[i]) {
				max = num5[i];
			}
		}
		System.out.println("최대값: " + max);
		
		// 4번
		int[] num4 = new int[5];
		for (int i = 0; i < num4.length; i++) {
			num4[i] = i + 1;
		}
		for (int x : num4) {
			System.out.print(x + " ");
		}
		System.out.println();
		// 3번
		int[] num3 = { 11, 22, 33, 44 };
		for (int i = 0; i < num3.length; i++) {
			if (num3[i] == 33) {
				System.out.println(i);
			}
		}

		// 2번
		String[] s = new String[3];
		for (int i = 0; i < 3; i++) {
			s[i] = JOptionPane.showInputDialog("과목입력");
		}
		System.out.println("**" + s[0] + "보다는 " + s[1]);
		// 1번
		int[] num1 = { 10, 20, 30, 40, 50 };
		System.out.println(num1[0] + num1[1]);
	}

}
