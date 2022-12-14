package 스레드;

public class ThreadRun3 {

	public static void main(String[] args) {
		CounterThread counter = new CounterThread();
		ImgThread img = new ImgThread();
		TimerThread timer = new TimerThread();
		counter.start();
		img.start();
		timer.start();
	}

}
