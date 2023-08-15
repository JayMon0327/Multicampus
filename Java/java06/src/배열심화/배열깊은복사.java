package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300};
		// 얕은 복사, 주소가 복사  / "값, 원본" 은 복사되지않고 하나다
		int[] num4 = num3.clone();  //깊은 복사, 주소가 가리키고 있는 값들을 복사 
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num4 == num3); // 주소가 똑같은지 비교하고 싶을 때 
		
		
		num3[0] = 999;
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num3[i]+"");
		}
		for (int i = 0; i < num4.length; i++) {
			System.out.print(num4[i]+"");
		}
		
		String[] 과목명 = {"국어,","영어","수학","컴퓨터","회화"};
		int[] 학기1성적 = {44, 66, 22, 99 ,100};
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적); // 주소비교
		학기2성적[0] = 22;
		학기2성적[2] = 88;
		
		
		
		
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] +" ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] +" ");
		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < 학기2성적.length; i++) {
			
			if (학기2성적[i]==학기1성적[i]) {
				count1++;
			}else if (학기2성적[i]>학기1성적[i]) {
				count2++;
				System.out.println("\n1,2학기 성적 중 오른 성적 과목명 "+ 과목명[i]);
				
			} 
			
				
			
		}
		System.out.println("1,2학기 성적 중 동일한 성적 과목수 "+ count1 + "개");
		System.out.println("1,2학기 성적 중 오른 성적 과목수 "+ count2 + "개");
		
		
		
		
		
		
		

	}

}
