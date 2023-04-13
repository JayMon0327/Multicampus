package 컬렉션;
import java.util.*;
public class 컬렉션정렬 {
  
  public static void main(String[]args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(100);
    list.add(600);
    list.add(200);
    list.add(400);
    list.add(300);
    list.add(500);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);

    //list에 있는 값들을 배열을 만들어서 프린트
    int[] array = new int[list.size()];
    for(int i = 0; i<array.length; i++){
      array[i] = list.get(i);
    }
    System.out.println(Arrays.toString(array));
    //수정된 배열을 arraylist를 새로 만들어서 넣은 후 프린트
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int i =0; 0<array.length; i++){
      list2.add(array[i]);
    }
    System.out.println(list2);
  }
}
