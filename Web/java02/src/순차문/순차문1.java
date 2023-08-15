package 순차문;

//부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// 기본 순차문 == 입력 -> 처리 -> 출력
		//입력 -> 부품사용, 망치같은 언제나 사용할 수 있는 것! 사용해보자!
		String a = JOptionPane.showInputDialog("취미가모야?");
		String b = JOptionPane.showInputDialog("언제하는데?");
		
		System.out.println("나의 취미는 " + a + " 이고 언제하냐면" + b + "해");
		//처리 -> 글자연결(+연산자 이용)
		//      더해지는 데이터가 하나라도 String이면 결과는 무조건 String
		String result = a + b; // 결과
		
		//출력 -> 모니터 화면에 보이고 싶음
	}

}
