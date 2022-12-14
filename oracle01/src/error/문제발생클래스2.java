package error;

public class 문제발생클래스2 {

	public static void main(String[] args) {
		try {
			//System.out.println(3/0);
			
			int[] num = {1, 2}; //0,1
			num[2] = 22; //2
			//여러개의 catch를 써주는 경우는 위는 작은거에서부터 아래는 큰것으로 써주어야한다.
		} catch (ArithmeticException e) {
			System.out.println("수학 에러");
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println("배열 에러");
		} catch (Exception e) {  //맨위에써주면 안됨.
			System.out.println("위에서 안잡은 다른 에러 처리");
		} finally {
			//반드시 처리되어야 하는 내용을 쓰는 편
			//db프로그램에서는 자원해제해주어야 하는 부분을 씀
			//db.close()
			System.out.println("아 에러처리 다 끝남..신남...");
		}
		
	}
}
