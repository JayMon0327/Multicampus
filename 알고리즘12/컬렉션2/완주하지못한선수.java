package 컬렉션2;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] all = { "leo", "kiki", "eden", "eden" };
		String[] end = { "eden", "kiki" };
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : all) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		for (String key : end) {
			map.put(key, map.getOrDefault(key, 0) - 1);
		}
//		for (String key : end) {
//			map.put(key, map.get(key) + 1);
//		}
		System.out.println(map);
		
		String answer = "";
		for (String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer += key + " ";
			}
		}
		System.out.println(answer);
	}

}
