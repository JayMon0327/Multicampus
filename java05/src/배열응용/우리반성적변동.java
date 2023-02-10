package 배열응용;

public class 우리반성적변동 {

	public static void main(String[] args) {
		int[] n1 = { 44, 66, 77, 22, 11 };
		int[] n2 = { 33, 55, 77, 22, 40 };
		
		int count1 = 0; // 동일한 개수 누적
		int count2 = 0; // 동일하지 않은 개수 누적
		
		for (int i = 0; i < n2.length; i++) {
			System.out.println(n1[i] == n2[i]);
			if (n1[i] == n2[i]) {
				count1++;
			}else {
				count2++;
			}
		}//for
		System.out.println("1-2 학기 성적이 동일한 학생수>> "+ count1+"명");
		System.out.println("1-2 학기 성적이 동일하지않은 학생수>> "+ count2+"명");

	}

}
