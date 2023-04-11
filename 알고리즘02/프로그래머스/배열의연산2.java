package 프로그래머스;
import java.util.Iterator;
import java.util.Scanner;

public class 배열의연산2 {

	public static void main(String[] args) {
		Solution4 sol = new Solution4();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int answer = sol.solution(numbers); // 평균내기 ! 평균은 double이기 때문에 double
		System.out.println(answer);
	}
}

class Solution4 {
    public int solution(int[] numbers) {
    	int answer = numbers[numbers.length - 3] + numbers[numbers.length - 2] + numbers[numbers.length - 1];
        return answer;
    }
}
