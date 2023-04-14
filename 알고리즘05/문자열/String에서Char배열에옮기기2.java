package 문자열;
import java.util.*;
public class String에서Char배열에옮기기2 {
  
  public static void main(String[]args) {
    String s = "s205623"; //부서번호 String도 index를 이용해서 추출 가능
   //56번 추출
   //1번방법 charAt 2개
    char c1 = s.charAt(3);
    char c2 = s.charAt(4);

    String s2 = String.valueOf(c1)+String.valueOf(c2);
    System.out.println(s2);
    //2번방법 substring 사용
    System.out.println(s.substring(3, 5));

    //3번방법 char배열을 만들어준뒤
    //s배열의 char를 가지고와서 char배열에 넣어줌
    char[] result = new char[2];
    s.getChars(3,5,result,0);
    System.out.println(Arrays.toString(result));

    //모든 글자를 String[]로 옮겨보세요.
    //첫번째 글자와 마지막 글자를 결합시켜 프린트(s1)
    
    String[] all = s.split("");
    //split에서 모든글자를 한글자씩 떨어뜨리려면 공백없이 "" 넣어주면됨
    System.out.println(all[0]+all[all.length-1]);
    

  }
}
