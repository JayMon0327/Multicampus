package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		//인기투표 해봅시다 ! 
		
		
		int vote1 = 0;
		int vote2 = 0;
		int vote3 = 0;
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("인기투표 1.아이유 2. 유재석 3. bts");
			if (data.equals("1")) {
				vote1++;
			}else if (data.equals("2")) {
				vote2++;
			}else if (data.equals("3")) {
				vote3++;
			}
		}
		System.out.println("아이유는"+ vote1 + "표");
		System.out.println("유재석은"+ vote2 + "표");
		System.out.println("bts는"+ vote3 + "표");
	
		

	}

}
