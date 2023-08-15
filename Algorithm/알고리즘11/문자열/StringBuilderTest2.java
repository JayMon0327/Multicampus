package 문자열;

import java.util.*;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		sb1.append("honghong");
		System.out.println(sb1);
		
		StringBuilder sb11 = new StringBuilder("honghong");
		System.out.println(sb11);
		
		StringBuilder sb2 = new StringBuilder("honghong");
		System.out.println(sb2);
		
		System.out.println(sb1 == sb2);
		sb1.append("hahaha");
		System.out.println(sb1);
		sb1.replace(0, 8, "hohohoh");//원본 수정 어디서 부터 어디까지 뭘로
		System.out.println(sb1);
		sb1.delete(0, 8); //원본수정 어디서 부터 어디까지 삭제
		System.out.println(sb1);
		sb1.deleteCharAt(0); //문자열 하나 지움
		System.out.println(sb1);
		sb1.reverse(); // 앞뒤를 바꿔줌
		System.out.println(sb1);
		
		StringBuilder sb3 = new StringBuilder("gnopgnop");
		System.out.println(sb3);
		
		String s = "gnopgnop";
		String[] s4 = s.split("");
		System.out.println(s4);
		
		
	}

}