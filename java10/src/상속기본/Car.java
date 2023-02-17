package 상속기본;

public class Car {
		String color;
		
		public void run() {
			System.out.println("빠르게 질주하다");
		}

		@Override
		public String toString() {
			return "Car [color=" + color + "]";
		}
		
	
		
}
