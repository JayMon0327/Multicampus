package ds03.프로그래머스기본.배열문제;

import java.util.*;

public class 배열자르기문제 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int start = 1;
		int end = 3;

		Solution5 sol = new Solution5();
		int[] answer = sol.solution(array, start, end);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution5 {
	public int[] solution(int[] array,int start, int end) { 
		int total = end - start+1; // 3-1+1(3개) 추출개수
		int[] answer = new int[total];
		//1.반복문 돌려서 답이 들어가는 배열에 하나씩 넣어줌
		//0~2
		//2.array의 start부터 end까지 하나씩 꺼내서!
		// start~end
		for(int i=0; i<total;i++){
			answer[i]=array[start];// 만약 1이 들어갓다면 
			start++; // 그다음에 2가 들어가도록 설정
		}
		return answer;
	}
}
