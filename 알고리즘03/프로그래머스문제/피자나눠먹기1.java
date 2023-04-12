package ds03.프로그래머스기본.프로그래머스문제;

public class 피자나눠먹기1 {

	public static void main(String[] args) {
		int n = 15;
		Solution3 sol = new Solution3();
		int answer = sol.solution3(n);
		System.out.println(answer);
	}
}

class Solution3 {
	   public int solution3(int n) {
	        int answer = 0; //주문할 피자수
	        //1. 1~7 --> 1
	        //2. 7의 배수인 경우 --> n/7
	        //3. 7의 배수가 아닌 경우 --> n/7 + 1
	        if (n <= 7) {
				answer = 1;
			}else if (n % 7 == 0) {
				answer = n / 7;
			}else {
				answer = n / 7 +1;
			}
	        return answer;
	    }
}