package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치 {

	public static void main(String[] args) {
		String s = "Zbcdefg";
		StringBuilder ss = new StringBuilder(s);
		ss.reverse();
		System.out.println(ss);
		ss.toString();
		String answer = ss.toString();;
		System.out.println(answer);
	
		//<첫번째>컬렉션으로 하는 방법 !! 
		
		//1-1. 내림차순으로 정렬을 한 후, 문자들을 하나씩 떨어뜨려야 한다. --> ArrayList, 배열
		String[] s2 = s.split("");
		List<String> list = Arrays.asList(s2);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		//1-2. for문을 이용해서 하나씩 꺼낸 후 ,
		for (String x : list) {
			answer = answer+x;
		}
		//2. answer에 붙인다.
		System.out.println(answer);
		
		//<두번째> StringBuilder로 푸는 방법
		
		char[] array = s.toCharArray();
		Arrays.sort(array);
		String s22 = array.toString();
		StringBuilder sb = new StringBuilder(s22);
		answer = sb.reverse().toString();
		System.out.println(answer);

	}

}
