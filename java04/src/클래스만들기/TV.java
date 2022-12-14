package 클래스만들기;
//class(부류, 같은 성격을 가진 group)
//Tv부류가 일반적으로 가져야하는 기능을 정의
public class TV {
	
	public int ch;
	public int vol;
	public boolean onOff;
	
	//함수정의=>메서드(method, 방법을 정의)! 
	public void on() {
		System.out.println("코드를 끼다.");
		System.out.println("켜지다.");
	}
	public void off() {
		System.out.println("끄다.");
		System.out.println("코드를 뽑다.");
	}
}
