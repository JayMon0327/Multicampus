package 문자열;

public class 수박수박수박수 {

	public static void main(String[] args) {
		String answer = "";
		int n = 100;
		for (int i = 0; i < n; i++) {
			if (i%2==0) {
				answer=answer+"수";
				
			}else if (i%2!=0) {
				answer = answer+"박";
			}
			System.out.println(answer);
		}

	}

}
