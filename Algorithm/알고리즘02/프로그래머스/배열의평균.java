package 프로그래머스;
import java.util.Iterator;
import java.util.Scanner;

public class 배열의평균 {

	public static void main(String[] args) {
		Solution3 sol = new Solution3();
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		double answer = sol.solution(numbers); // 평균내기 ! 평균은 double이기 때문에 double
		System.out.println(answer);
	}
}

class Solution3 {
    public double solution(int[] numbers) {
    	System.out.println(numbers.length);
    	int size =numbers.length;
    	//{1,2,3,4,5,6,7,8,9,10}
    	int sum = 0;
    	for (int x : numbers) { //배열의 합 구하기
			sum = sum+x;
		}
    	//System.out.println((double)sum/size); //구해놓은 배열의 합으로 배열의 평균 구하기 주의 ! 
    	//둘 중 하나는double 이어야 double값
        double answer = (double)sum/size; //가능
        double answer2 = sum/(double)size; //가능
        double answer3 = (double)(sum/size); //불가능
        //자바에서는 int, int 계산의 결과는 무조건 int 
        //			하나라도 실수(double,float)이면 무조건 실수
        // !! 변수는 만들때 타입이 결정되고 절대 바뀌지 않는다 --> 정적타입핑 !! 
        return answer;
    }
}
