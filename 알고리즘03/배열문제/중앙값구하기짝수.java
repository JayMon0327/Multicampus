package ds03.프로그래머스기본.배열문제;
import java.util.*;

public class 중앙값구하기짝수 {
  public static void main(String[]args) {
    int[]s = {5,2,1,9,11,15,17,21};
    // 배열에 들어간 하나의 값: element,엘리먼트
    // 짝수개인 경우, 중앙에 있는
    // 2개의 값을 더해서 프린트
    String s2 = Arrays.toString(s);
    System.out.println(s2);
    // 1, 2, 3, 4, 5, 6 —> 6 / 2: 3, 2
    // 1, 2, 3, 4, 5, 6, 7, 8 —> 8 / 2: 4, 3
    // 1, 2, 3, 4, 5 → array.length:5 / 2 —> 인덱스 2
  
    //1. 정렬을 먼저하자
    Arrays.sort(s); //파괴!
    System.out.println(Arrays.toString(s));
    //2. 중앙위치를 구하자
    int center = (s.length /2);

    //3. 배열의 중앙위치값을 get!
    int answer = s[center]+s[center-1];
    System.out.println(answer);
  }
}
