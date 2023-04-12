package ds03.프로그래머스기본.배열문제;

import java.util.*;
public class 문자열길이배열로리턴 {

	public static void main(String[] args) {
		String[] stylelist = {"I","Love","Programmers."};
		
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(stylelist);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution3 {
	public int[] solution(String[] stylelist) {
		//반복문 돌면서, 하나씩 꺼내온다.
		//꺼낸 데이터의  글자수를 구해서
		//int[]배열에 넣는다.
		int[] answer = new int[stylelist.length]; 
		for(int i =0; i<stylelist.length; i++){
			answer[i]=stylelist[i].length();
		}
		return answer;
	}
}