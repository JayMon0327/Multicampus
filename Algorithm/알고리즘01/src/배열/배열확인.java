package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		// 1) 배열을 만드는 방법 1 
		// 배열 만들 때부터 값을 알고 있을 경우
		int[] ages = {60,50,30,20,10};
		
		//2) 배열을 만드는 방법 2 
		// 배열을 만들 때는 값을 모르고 있다고 나중에 넣는 경우
		double[] weight = new double[5];
		weight[0]= 77.8;
		weight[1]= 45.5;
		weight[2]= 88.5;
		weight[3]= 99.5;
		weight[4]= 35.5;
		
		// for문 2가지
		//1) c타입
		for (int i = 0; i < weight.length; i++) {
			System.out.println(ages[i]+" "+weight[i]);
		}
		
		//2) for-each -> 2 개 이상의 배열을 돌릴 수 없다 단일
		for (double d : weight) {
			System.out.println(d);
		}
		
		
	}

}
