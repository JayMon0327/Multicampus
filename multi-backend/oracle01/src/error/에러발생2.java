package error;

//MemberDAO
public class 에러발생2 {

	//insert()
	public void call() {
		//실행에러(run-time error)   <---> 번역에러(compile error)
		try {
			System.out.println(3/0);
		} catch (Exception e) {
			System.out.println("내가 예외처리했음. 프로그램 중단x");
		}
	}
}

/*
 * ctrl + n(new) : 새로만들기(project, package, class)
 * ctrl + s(save) : 저장하기 
 * ctrl + d(delete) : 블럭안잡고 한줄삭제
 * alt + 화살표 방향 : 한줄 이동, 여러줄을 블럭잡고 alt + 화살표
 * ctrl + alt + 화살표 아래 : 블럭안잡고 한줄 복사, 여러줄을 블록잡고 ctrl + alt + 화살표 아래
 */

