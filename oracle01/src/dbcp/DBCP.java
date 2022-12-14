package dbcp;

//싱글톤 만드는 방법, 내가 만들어서 외부에 제공(getInstance())
public class DBCP {
	//내(DBCP)가 하나만 만들어서 내가 필요한 클래스에 주자!!!
	static DBCP instance = null;

	//생성자 메서드를 private으로 선언하여 외부에서
	//객체를 여러개 만들지못하게 막아버리자!!!
	//객체생성할 때 클래스이름과 동일한 생성자를 호출하게 되어있음.
	//new DBCP()를 못하게 외부에서 접근불가로 만들어버림.
	private DBCP() {
	}
	
	//내가 만들어놓은 객체를 외부에 주는 메서드 하나 
	//public을 만들어주자.
	public static DBCP getInstance() {
		if(instance == null) {
			instance = new DBCP();
		}
		return instance;
	}
	
}






