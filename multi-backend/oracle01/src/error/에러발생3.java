package error;

import java.io.FileNotFoundException;

//MemberDAO
public class 에러발생3 {

	// insert() ---> call()메서드를 호출한 메서드에 예외처리를 떠넘길수 있어!!
	public void call() throws Exception {
		// 실행에러(run-time error) <---> 번역에러(compile error)
		System.out.println(3 / 0); //실행에러 있는 줄
	}
}

/*
 * ctrl + n(new) : 새로만들기(project, package, class) ctrl + s(save) : 저장하기 ctrl +
 * d(delete) : 블럭안잡고 한줄삭제 alt + 화살표 방향 : 한줄 이동, 여러줄을 블럭잡고 alt + 화살표 ctrl + alt +
 * 화살표 아래 : 블럭안잡고 한줄 복사, 여러줄을 블록잡고 ctrl + alt + 화살표 아래
 */
