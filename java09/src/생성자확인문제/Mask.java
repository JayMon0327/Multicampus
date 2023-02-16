package 생성자확인문제;

public class Mask {
	String color;
	int price;
	int s;
	public Mask(String color, int price, int s) {
		this.color = color;
		this.price = price;
		this.s = s;
	}
	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", s=" + s + "]";
	}
	
	
}
