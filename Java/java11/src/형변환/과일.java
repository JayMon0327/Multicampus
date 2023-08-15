package 형변환;

import java.util.HashMap;

import javax.activation.MailcapCommandMap;

public class 과일 {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		//map.put(키,값)
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "메론");
		System.out.println(dic);
		System.out.println(dic.get("apple")); //get (키)
		dic.remove("banana");
		dic.replace("melon", "똥강아지");
		 System.out.println(dic);

	}

}
