package ds03.프로그래머스기본.프로그래머스문제;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 10; //주문 수
		int k = 3; //음료수 주문 수
		Solution2 sol = new Solution2();
		int answer = sol.solution(n,k);
		System.out.println(answer);
	}
}

class Solution2 {
	public int solution(int n, int k) {
			int free = n/10; // 무료로 주는 음료 수
			int answer = n * 12000 + k * 2000 - free * 2000;
			return answer;
	}
}