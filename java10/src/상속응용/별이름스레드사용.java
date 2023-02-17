package 상속응용;

public class 별이름스레드사용 {

	public static void main(String[] args) {
		별스레드 별 = new 별스레드();
		이름스레드 이름 = new 이름스레드();
		감소스레드2 감소 = new 감소스레드2();
		증가스레드2 증가 = new 증가스레드2();
		별.start();
		이름.start();
		감소.start();
		증가.start();
	}

}
