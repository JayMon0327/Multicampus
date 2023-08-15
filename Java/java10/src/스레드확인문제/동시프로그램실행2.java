package 스레드확인문제;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		$스레드 $ = new $스레드();
		$스레드2 $2 = new $스레드2();
		$스레드3 $3 = new $스레드3();
		
		$.start();
		$2.start();
		$3.start();
		

	}

}
