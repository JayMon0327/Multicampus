package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {
		//누적시키는 변수는 반복문안에 넣으면 안됨.!
		//반복할 때마다 누적되지 않고, 초기화되기 때문에.!
		int ok = 0, no = 0, etc = 0;
		for (int i = 0; i < 5; i++) {
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				ok++;//증감연산자
//				ok = ok + 1;
			} else if (data.equals("no")) {
				System.out.println("부정");
				no++;
			} else {
				System.out.println("잘모르겠음.");
				etc++;
			}
		}
		System.out.println("긍정횟수: " + ok + "회");
		System.out.println("부정횟수: " + no + "회");
		System.out.println("잘 모르겠음횟수: " + etc + "회");
	}

}
