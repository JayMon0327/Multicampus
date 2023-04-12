package ds03.프로그래머스기본.프로그래머스문제;

public class 피자나눠먹기2 {

	public static void main(String[] args) {
		int n = 15;
		Solution4 sol = new Solution4();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution4 {
	public int solution(int n) {
			int answer = 0;
			for(int i = 1; i <= n; i++){
					if(i * 6 % n == 0) {
							answer = i;
							break;
					}
			}
			return answer;
	}
}