package 정렬;

import java.util.Arrays;

class Swaptest_자리바꾸기 {
    public static void main(String[] args) {
      int[] num = {6, 1, 2, 3, 5, 9};
      System.out.println(Arrays.toString(num));
      int temp = num[5]; 
      // 아래처럼 옮겼을 때 5 자리의 값이 사라짐 
      // 사라지기전에 미리 다른곳에 저장
      num[5] = num[0];
      num[0] = num[5];
      num[0] = temp;
      System.out.println(Arrays.toString(num));
      // num[0] --> 6, num[5] -->9
    }
}