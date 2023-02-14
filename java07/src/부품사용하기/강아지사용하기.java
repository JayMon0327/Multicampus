package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 puppy = new 강아지();
		puppy.품종= "달마시안";
		puppy.크기= "대형견";
		puppy.짖기();
		System.out.println("강아지 품종은: "+puppy.품종);
		System.out.println("강아지 크기는: "+puppy.크기);
		강아지 puppy2 = new 강아지();
		puppy2.품종= "포메라니안";
		puppy2.크기= "소형견";
		puppy2.애교부리기();
		System.out.println("강아지 품종은: "+puppy2.품종);
		System.out.println("강아지 크기는: "+puppy2.크기);
		

	}

}
