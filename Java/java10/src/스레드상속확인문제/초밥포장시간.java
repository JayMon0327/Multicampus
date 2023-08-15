package 스레드상속확인문제;

public class 초밥포장시간 extends Thread{
@Override
public void run() {
	for (int i = 600; i > 0; i--) {
		System.out.println("초밥포장 남은시간 >> : "+ i);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("CPU error");
		}
	}
	
}

}
