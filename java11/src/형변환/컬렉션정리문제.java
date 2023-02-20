package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.activation.MailcapCommandMap;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class 컬렉션정리문제 {

	public static void main(String[] args) {
		// 1. 중복제거 !! -->  set
		HashSet tour = new HashSet();
		tour.add("일본");
		tour.add("태국");
		tour.add("미국");
		tour.add("러시아");
		tour.add("베트남");
		System.out.println(tour);
		
		//2. 키+값으로 쌍으로 넣을 때는! --> map
		HashMap home = new HashMap();
		home.put("안방", "TV");
		home.put("거실", "쇼파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		System.out.println(home);
		System.out.println(home.get("현관"));
		home.put("거실", "책상");
		System.out.println(home);
		
		//3. 할 일 우선순위(순서) --> Arraylist
		ArrayList dolist = new ArrayList();
		dolist.add("자바공부");
		dolist.add("점심");
		dolist.add("자바복습");
		dolist.add("자바스터디");
		dolist.add("쉬기");
		System.out.println(dolist);
		System.out.println(dolist.get(0));
		System.out.println(dolist.get(dolist.size()-1));
		dolist.set(1, "청소");
		System.out.println(dolist);

	}

}
