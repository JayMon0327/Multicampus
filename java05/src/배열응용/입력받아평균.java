package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) { // 52페이지에 문제있음
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 -> 배열을 사용 !!
		// 1. 배열을 만들어주세요. 
		int[] jumsu = new int[5];
		
		//배열에 값을 넣을 때는 index가 필요
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자입력");
			//숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer. parseInt(data); //배열 i번째에 이 값을 넣어라
		}
		for (int x : jumsu) {
			System.out.println(x + " ");
			
		}
		System.out.println();
		
		
		
		//1. 전체 합계 구해서, 평균 구해보세요.
		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x; // == sum += x;
			
		double avg = (double)sum / jumsu.length; // 평균은 기본적으로다가 소수점을 가지고 있는넘. double 
			System.out.println("전체합계: "+sum);	
			System.out.println("전체평균: "+avg);
			
		}
		
		
		//2. 300이상 되는 숫자만 찾아서, 합계를 구해보세요
		int sum2 =0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >=300) {
				sum2 = sum2 + jumsu[i];
			}
		}
		System.out.println("300이상숫자의 합" + sum2);
		//3. 심화문제, 300이상 되는 위치인 index를 프론트 
		// => 해당 인덱스의 값이 300이상인지 조건체크 -> i를 프린트
		//jumsu[0] -> jumsu변수에 들어있는 주소가 가리키는 0번 인덱스 공간
		// 0 ?? ==? 위치값, 인덱스
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >=300) {
				System.out.println("300인 값이 저장된 인덱스"+i);
				
				//특정한 index에 있는 값이 300이상인 위치를 프린트 해보세요. (i값이 곧 위치 = 주소 다 ! index 값 프린트
			}
		}
	}

}
