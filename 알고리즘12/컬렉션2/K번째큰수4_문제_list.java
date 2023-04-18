package 컬렉션2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class K번째큰수4_문제_list {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); //k번째 작은 수, 2
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			int data = sc.nextInt();
			if( data == 0) {
				break;
			}else {
				list.add(data);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println("첫 번째 작은 수 : " + list.get(0));
		System.out.println("두 번째 작은 수 : " + list.get(1));
		System.out.println(k + "번째 작은 수 : " + list.get(k - 1));
	}

}
