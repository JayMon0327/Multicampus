package ds03.프로그래머스기본.배열문제;

import java.util.*;
public class 리턴여러개배열로 {

	public static void main(String[] args) {
		
		int money = 15000;
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(money);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution2 {
	public int[] solution(int money) {
		int[] answer = {0,0}; // 몇잔,나머지 돈
		// int[] answer = new int[2];
		int price= 5500;
		answer[0]= money/price; //2잔 먹을 수 있음
		answer[1]= money % price; //나머지돈


		return answer;
	}
}