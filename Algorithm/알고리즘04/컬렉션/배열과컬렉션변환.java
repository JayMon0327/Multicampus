package 컬렉션;
import java.util.*;
public class 배열과컬렉션변환 {

  public static void main(String[]args) {
    int[] s ={5,2,1,9,11,15,17};
    Arrays.sort(s); // 파괴 정렬
    System.out.println(Arrays.toString(s));
    intprint(s);
    
    String[] s2 ={"aaa","bbb","ccc","aaa"};
    stringprint(s2);
    List<String> list = Arrays.asList(s2);
    System.out.println(list);
    //-> List 로 변형하면, 조금 더 다양한 처리들을 for문 사용하지 않고 할 수 있음
    // 하지만 !! asList로 가지고 오면 index를 생성삭제하는 부분이 불가능함 -> 아래에 해결방법(ArrayList로 새로 만들어줌)
    //1.배열에 aaa가 궁금해요 ! 
    System.out.println(list.contains("aaa"));
    //2.bbb삭제
    // System.out.println(list.remove(1)); 
    // !! aslist로 가져오는 list는 index에 영향을 주는건 허용안됨 !!
    //3.aaa가 들어있는 마지막 위치를 찾아보세요.
    System.out.println(list.lastIndexOf("aaa"));
    //4.전체 내용 프린트
    System.out.println(list);
    //5.맨 앞에 ddd삽입
    //6.맨 앞에 fff삽입
    //7.인덱스 2번의 내용을 ggg로 변경
    list.set(2,"ggg");
    System.out.println(list);

    //배열에 한계가 있어서 List로 변환하여
    //다양한 처리를 함.
    //코딩테스트에서는 반환을 거의 배열로 하게 되어있음
    //asList로 만든 list를 다시 배열로 반환하면 됨.
    // String[] s3 = (string[])list3.toArray();
    // stringprint(s3);

    //해결방법 ! -> 제약이 없는 ArrayList를 다시 만들어주면 된다.!
    List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
    list3.add("hahaha");
    list3.remove("bbb");
    System.out.println(list3);
  }
  public static void intprint(int[] array){ // System.out.println(Arrays.toString(array)); 매번 치는 것들을
    //함수로 만들어줌
    System.out.println(Arrays.toString(array));
  }
  public static void stringprint(String[] array){ // System.out.println(Arrays.toString(array)); 매번 치는 것들을
    //함수로 만들어줌
    System.out.println(Arrays.toString(array));
  }
}
