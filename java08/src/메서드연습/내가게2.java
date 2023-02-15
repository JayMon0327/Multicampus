package 메서드연습;

import javax.naming.spi.DirStateFactory.Result;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int result = cal.add(300, 200);
		double result2 = cal.add(300, 22.2);
		double result3 = cal.add(11.1, 22.2);
		String result4 = cal.add("나는 오늘 몇시에 먹을까 ",1);
//		String result44 = cal.add(1, " 시각");
//		String result43 = cal.add(1);  매서드에 저장해놓은 값 순서가 달라버리면 오류가 뜸
		System.out.println(result - 1000);
		System.out.println(result - 1000);
		System.out.println(result - 1000);
		System.out.println(result4 +" 너무늦어 !!");

	}

}
