package 컬렉션2;

import java.util.HashMap;

public class 과일투표문제_map {

	public static void main(String[] args) {
		String[] s = {"apple", "banana", "apple", "banana", "melon", "apple"};
		HashMap<String, Integer> map = new HashMap<>();
		//짝꿍지어서 카운트를 할때 map이 편하다.
		for (String key : s) {
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		System.out.println(map);
		int maxValue = 0;
		String maxKey = "";
		for (String key : map.keySet()) {
			//System.out.println(map.get(key));
			if(map.get(key) > maxValue) {
				maxValue = map.get(key);
				maxKey = key;
			}
		}
		System.out.println(maxKey + "의 득표수는  " + maxValue);
		System.out.println(map.keySet());
	}

}
