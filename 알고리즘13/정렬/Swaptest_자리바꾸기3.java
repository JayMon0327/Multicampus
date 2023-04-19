package 정렬;

import java.util.Arrays;

class Swaptest_자리바꾸기3 {
    public static void main(String[] args) {
      int[] num = {6, 1, 2, 3, 5, 9};
      print(num);
      swap(num,0,5); 
      // 2개의 값만 주는게 아니라 배열의 정보까지 함수에 등록함으로써 
      //함수가 직접 배열을 수정할 수 있게 함
      // swap(0,5)->swap(num,0,5) 
      print(num);

    }
    public static void swap(int[] num,int idx1, int idx2) {
      System.out.println(num[idx1] + ", "+ num[idx2]);
      int temp = num[idx2];
      num[idx2] = num[idx1];
      num[idx1] = temp;
      System.out.println(num[idx1] + ", "+ num[idx2]);
    }
    public static void print(int[] num) {
      System.out.println(Arrays.toString(num));
    }
    public static void print(String[] str) {
      System.out.println(Arrays.toString(str));
    }
}