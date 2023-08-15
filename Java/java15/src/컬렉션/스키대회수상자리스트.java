package 컬렉션;

import java.util.ArrayList;

public class 스키대회수상자리스트 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		for (int i = 0; i < ski.size(); i++) {
			System.out.print(i + 1 +")" + ski.get(i) + " ");
		}
		System.out.println();
		ski.remove(1);
		for (int i = 0; i < ski.size(); i++) {
			System.out.print(i + 1 +")" + ski.get(i) + " ");
		}
	}

}
