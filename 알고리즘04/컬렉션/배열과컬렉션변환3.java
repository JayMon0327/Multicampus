package 컬렉션;
import java.util.*;

public class 배열과컬렉션변환3 {

	public static void main(String[] args) {
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		
    //배열을 가지고 하면 복잡한 처리가 있으면 list로 하면 편하다.
    //검색, 수정, 인덱스의 작업을 하시려면 asList()를 사용하면 된다.
    //asList()로 하면 실제로는 원본 배열을 가지고 처리하는 것이기 때문에
    //길이와 관련된 추가, 삭제, 삽입이 불가능 하다 !! 
    //그래서 !! 추가,삭제,삽입의 작업을 하시려면 모든 기능을 가진 ArrayList를 새로 만들어주면 됨.
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(s2));
    //1. aaa가 포함되어 있나요 ?
    System.out.println(list.contains("aaa"));
    //2. 맨 뒤에 "fff"를 추가해라
    list.add("fff");
    System.out.println(list);
    //3. 원하는 index에 "ggg"를 삽입해라
    list.add(1,"ggg");
    //4. "ccc"를 삭제해라
    list.remove("ccc");
    System.out.println(list);

    //< 코딩테스트 할때 >
    //배열로 옮겨야 한다면!
    //새롭게 배열을 만들어 옮겨보세요.
    String[] s3 = new String[list.size()];
    for(int i =0; i<s3.length;i++){
      s3[i] = list.get(i);
    }
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}
}