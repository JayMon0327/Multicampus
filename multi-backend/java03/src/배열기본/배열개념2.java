package 배열기본;

public class 배열개념2 {

	public static void main(String[] args) {
		//배열은 일반적으로 같은 타입을 묶을 때 사용!
		//다양한 타입을 묶을 때는 배열을 쓰지 않음.!
		//배열은 고정된 크기를 가진다.(크기 조절 불가능)
		int[] temp = new int[7];
		temp[0] = 10;
		temp[1] = 11;
		temp[2] = 12;
		temp[3] = 13;
		temp[4] = 14;
		temp[5] = 15;
		temp[6] = 16;
		for (int i = 0; i < temp.length; i++) {
			System.out.println(i + 1 + "일차: " + temp[i]);
		}
	}

}
