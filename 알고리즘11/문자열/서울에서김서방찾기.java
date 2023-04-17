package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String answer="";
		List<String> list = Arrays.asList(seoul);
		System.out.println(list.indexOf("Kim"));
		answer="김서방은 "+list.indexOf("Kim")+"에 있다";
		System.out.println(answer);
		
		//2번방법
		String answer2 = "";
		int findIndex = 0;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
			findIndex = i;
			}
		}
		answer2="김서방은 "+findIndex+"에 있다.";

	}

}
