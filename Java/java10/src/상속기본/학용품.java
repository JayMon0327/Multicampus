package 상속기본;

public class 학용품 {
		String 학용품;
		int 가격;
		String 회사;
		
		public void 사다() {
			System.out.println("물건을 사다");
		}

		@Override
		public String toString() {
			return "학용품 [학용품=" + 학용품 + ", 가격=" + 가격 + ", 회사=" + 회사 + "]";
		}

	
}
