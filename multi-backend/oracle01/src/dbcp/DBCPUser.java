package dbcp;

public class DBCPUser {

	public static void main(String[] args) {
		//DBCP name = new DBCP(); //private, 외부에서 객체생성 막아버려서 객체생성X
		
		//싱글톤 방법-> 객체를 하나만 만들어서 하나만 계속 사용하는 방법
		//<----> 프로토타입(원형) 방법:
		//       틀을 이용해서 필요할 때마다 계속 여러개 만들어서 사용하는 방법
		DBCP dbcp = DBCP.getInstance(); //최초로 객체를 요구할 때 DBCP도 객체를 만든다.
		System.out.println(dbcp);
		
		DBCP dbcp2 = DBCP.getInstance(); //두번째 객체를 요구할 때 아까만들어둔 객체를 리턴
		System.out.println(dbcp2);
		
	}

}
