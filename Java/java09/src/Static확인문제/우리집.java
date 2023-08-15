package Static확인문제;

public class 우리집 {

	public static void main(String[] args) {
		딸 dol1 = new 딸("홍길순","여");
		딸 dol2 = new 딸("홍길진","여");
		System.out.println(dol1);
		System.out.println(dol2);
		System.out.println("우리집 딸은 "+딸.count+"명입니다.");
		System.out.println(딸.아빠지갑);
		

	}

}
