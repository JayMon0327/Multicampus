package test;

public class ThreadMain {

	public static void main(String[] args) {
		//스레드 객체 3개 만들어주세요. ==> ram에 준비
		CounterThread  counter = new CounterThread();
		ImgThread img = new ImgThread();
		TimerThread timer = new TimerThread();
		
		//cpu한테 실행할 대기줄에 넣어주세요.
		counter.start();
		img.start();
		timer.start();
	}
}
