package 배열복습비교;

import java.util.Arrays;
import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) { //for : 입력, 출력, i 활용 가능
			jumsu[i] = r.nextInt(1000)+1;
			
		}
		for (int x : jumsu) { //알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다 /출력용!!
			System.out.println(x);
		}
		//정렬(sort)오름차순(작-->큰, 오름차순 / 큰-->작, 내림차순)
		Arrays.parallelSort(jumsu);
		//sort(jumsu) ==> jumsu가 바뀌어버림(원본이 파괴)
		//파괴형 함수
		
		//parseInt(n) --> ram에 저장된 n이 변경된 건아님(원본이 비파괴)
		//비 파괴형 함수
		System.out.println("===========================");
		for (int x : jumsu) {
			System.out.println(x);
		}
		//정렬 후 , 최대값, 최소값을 프린트 ! 
		System.out.println("최소값"+jumsu[0]);
		System.out.println("최대값"+jumsu[jumsu.length-1]);
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) {
			sum30=sum30 + jumsu[i]; // sum+=i;
		}
		System.out.println("상위30퍼 "+sum30/3000.0);
		int sum70 = 0;
		for (int i = 0; i < 3000; i++) {
			sum70=sum70+jumsu[i];
		} //for
		//학생 질문 참고
//		System.out.println("하위30퍼 "+sum70/3000.0);
//		String result = Arrays.toString(jumsu); //비파괴,string
//		System.out.println(result); // int를 string으로 변환
	}
	//상위 30퍼 , 인원 3000명, 높은 점수부터 추출
	
	

}
