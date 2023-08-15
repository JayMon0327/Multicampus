package 스레드확인문제;

public class $스레드2 extends Thread{
@Override
public void run() {
	for (int i = 0; i < 1000; i++) {
		System.out.println(i+": @");
	}
}
}
