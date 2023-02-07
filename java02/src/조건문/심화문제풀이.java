package 조건문;

import javax.swing.JOptionPane;

public class  심화문제풀이{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x1 = JOptionPane.showInputDialog("정수를 입력하세요.1");
		String y1 = JOptionPane.showInputDialog("정수를 입력하세요.2");
		String op = JOptionPane.showInputDialog("사칙연산자를 입력하세요.(+,-,*,/)");
		int x = Integer.parseInt(x1);
		int y = Integer.parseInt(y1);
		double result = 0;
		System.out.printf("첫번째 정수는 %d입니다.\n", x);
		System.out.printf("두번째 정수는 %d입니다.\n", y);
		switch (op) {
		case "+":
			result = x + y;
			System.out.println("덧셈을 진행합니다.");
			System.out.println("결과는 " + result + "입니다.");
			break;
		case "-":
			result = x - y;
			System.out.println("뺄셈을 진행합니다.");
			System.out.println("결과는 " + result + "입니다.");
			break;
		case "*":
			result = x * y;
			System.out.println("곱셈을 진행합니다.");
			System.out.println("결과는 " + result + "입니다.");
			break;
		case "/":
			if (y == 0) {
				System.out.println("실행할 수 없습니다.");
				break;
			} else {
				result = (double) x / (double) y;
				System.out.println("나눗셈을 진행합니다.");
				System.out.printf("결과는 %.2f입니다.", result);
				break;
			}
		}

	}

}
