package 프로그래머스;


public class 배열의연산3 {
	//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 	27
	//{1, 2, 3, 4, 5, 9, 10} 			24
	//{-20, -30, 3, 4, 5, 9, 10}		600
	//두 수를 곱했을 때 가장 큰 숫자를 구해보세요.
	//배열이 오름차순으로 정렬이 되어 있는 상태!
	
	public static void main(String[] args) {
		Solution5 sol = new Solution5();
		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numbers = {-20, -30, 3, 4, 5, 9, 10};
		int answer = sol.solution(numbers); // int[]
		System.out.println(answer);
	}
}

class Solution5 {
	public int solution(int[] numbers) {
		int post = numbers[numbers.length-1] * numbers[numbers.length-2]; //뒤에 2개
		int pre = numbers[0] * numbers[1]; //앞에 2개
		int answer = 0;
		if(post > pre) {
			answer = post;
		}else {
			answer = pre;
		}
		System.out.println(answer);
		return answer;
	}
}