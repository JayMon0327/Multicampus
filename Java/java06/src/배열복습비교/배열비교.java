package 배열복습비교;

import java.util.Random;

public class 배열비교 {

	private static String jumsu;

	public static void main(String[] args) {
		// 입력
		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
//		System.out.println(답안지.length);
//		System.out.println(내답안.length);
//		System.out.println(답안지);
//		System.out.println(내답안);
		
		Random r = new Random(42); // 
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4)+1; // 0~3 -> 1~4
			내답안[i] = r.nextInt(4)+1; // 토익은 4지 선다
		}
		
		//확인!!
		System.out.println("번호\t:\t답안\t\t내답");
		int jumsu3 = 0;
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println(i+"\t:\t" + 답안지[i] + "\t<->\t " + 내답안[i]);
			// 처리
			
			for (int j = 0; j < 내답안.length; j++) {
				if(내답안[j] == 답안지[j]) {
					jumsu3++;
					}//if
			} 
			
			// 출력
		}//for
		System.out.println("토익점수는"+ jumsu3/답안지.length);
		
		
		
		

	}

}
