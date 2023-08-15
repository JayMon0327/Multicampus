package 스레드상속확인문제;

public class 우리가족저녁식사 {

	public static void main(String[] args) {
		초밥포장시간 sushi = new 초밥포장시간();
		저녁식사시간 dinner = new 저녁식사시간();
		메뉴사진 menu = new 메뉴사진();
		sushi.start();
		dinner.start();
		menu.start();

	}

}
