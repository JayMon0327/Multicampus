package 상속응용;

public class 이름스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5000; i++) {
			System.out.println(i+": 길동이");
		}
	}
}
