package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들때  값을 이미 알고있는 경우
		int[][] n1= {
			//j  0 1 2      i
				{1,2,3},   //0
				{4,5,6,7}  //1
		};
		System.out.println(n1.length);
		System.out.println(n1[0][0]);// 2차원배열의 length(행)
		System.out.println(n1[1][2]);// 2차원배열의 length(행)
		for (int i = 0; i < n1.length; i++) { //행
			for (int j = 0; j < n1[i].length; j++) { //한 행을 다 찍기 위함(열)
				System.out.println(n1[i][j]);
			}
		}
		//배열을 만들때 값을 아직 모르는 경우, 공간을 먼저 만든다.
		int[][] n2 = new int[2][3];
	}

}
