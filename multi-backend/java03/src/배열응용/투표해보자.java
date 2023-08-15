package 배열응용;

import javax.swing.JOptionPane;

public class 투표해보자 {
	public static void main(String[] args) {
		String[] names = { "블랙핑크", "유재석", "아이유", "이효리", "비" };
		int[] 투표수 = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력 0)블랙핑크, 1)유재석, 2)아이유, 3)이효리, 4)비");
			int choice2 = Integer.parseInt(choice);
			// 0~4
			if(choice2< 0 || choice2 > 4) {
				i--;
			}else {
				투표수[choice2]++;
				System.out.println("i값: " + i);
			}
		}
		for (int i = 0; i < 투표수.length; i++) {
			System.out.println(i + "번은 " + 투표수[i] + "표");
		}
		int max = 투표수[0];
		for (int i = 0; i < 투표수.length; i++) {
			if(투표수[i] > max) {
				max = 투표수[i];
			}
		}
		for (int i = 0; i < 투표수.length; i++) {
			if(투표수[i] == max) {
				System.out.println(i + ": " + names[i]);
			}
		}
	}
}







