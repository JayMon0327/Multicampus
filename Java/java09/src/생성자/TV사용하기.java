package 생성자;

import org.omg.CORBA.PUBLIC_MEMBER;

import 생성자.TV;

public class TV사용하기 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.ch = 10;
		tv1.vol = 9;
		tv1.onOff = true;
		
		tv1.채널을바꾸다();
		System.out.println(tv1.ch+" "+ tv1.vol+" "+tv1.onOff);
		System.out.println(tv1);
		
		//파라메터 있는 생성자가 있는경우, 파라메터 없는 기본생성자가
		//자동으로 만들어지지 않음.
		TV tv2 = new TV();
		tv2.ch = 20;
		tv2.vol = 15;
		tv2.onOff = false;
		tv2.유튜브보다();
		System.out.println(tv2.ch+" "+ tv2.vol+" "+tv2.onOff);
		System.out.println(tv2);
	}

}
