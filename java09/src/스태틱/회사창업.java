package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 직원1 = new 직원("홍길동",25,"여");
		직원 직원2 = new 직원("김길동",24,"남");
		직원 직원3 = new 직원("송길동",26,"여");
		System.out.println("우리회사의 직원수는 "+직원.count+"명");
		System.out.println(직원1+"\n"+직원2+"\n"+직원3);
		

	}

}
