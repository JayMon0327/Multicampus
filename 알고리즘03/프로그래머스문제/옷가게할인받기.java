package ds03.프로그래머스기본.프로그래머스문제;

public class 옷가게할인받기 {

	public static void main(String[] args) {
		int price = 580000;
		Solution5 sol = new Solution5();
		int answer = sol.solution5(price);
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution5(int price) {
		int answer = 0;
		if(price >= 500000){
			answer = (int)(price - price * 0.2);
		}else if(price >= 300000){
			answer = (int)(price - price * 0.1);
		}else if(price>=100000){
			answer = (int)(price - price * 0.05);
		}
		return answer;
	}
}