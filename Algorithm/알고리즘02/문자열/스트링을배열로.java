package 문자열;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[]로 바꾸어 보세요.
		String[] all2 = all.split(","); //쉼표뒤에 공백이 있으면 따옴표 안에 공백 포함해서 넣으면 공백까지 제거됨	// == String[] all2 = {"국어"," 영어"," 수학"," 컴퓨터"};
		System.out.println(all2.length);
		System.out.println(all2[1]);
		// 2. 바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 후 , 다시 배열에 넣으세요.
		for (int i = 0; i < all2.length; i++) {
			if(all2[i].contains(" ")) // 만약에 공백을 포함 하고 있으면 ! 
				all2[i]	= all2[i].trim(); // 공백제거 함수
		}
		System.out.println(all2[1]);
		// 3. 과목 수는?
		System.out.println("과목수: "+ all2.length);
		System.out.println(Arrays.toString(all2)); // 배열 안찍어도 안에 무슨 내용이 있는지 알게 해줌
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].equals("컴퓨터")) {
				System.out.println(i);
			}//if
		}//for

		int count= 0;
		for (int i = 0; i < all2.length; i++) {
			if (all2[i].length()<3) {
				count++;
			}//if
		}//for
		System.out.println(count);
		
	}

}
