package 배열정리;

public class 이차원배열3 {

	public static void main(String[] args) {
		int[][] seat = new int[3][];
		//2차원 배열은 1차원 배열을 연결!
		int[] s1 = {1,2,3};
		int[] s2 = {1,2,3,4};
		int[] s3 = {1,2,3,4,5};
		seat[0] = s1;
		seat[1] = s2;
		seat[2] = s3;
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
