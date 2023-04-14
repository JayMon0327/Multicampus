package 문자열;

public class 문자열반복하기 {
  public static void main(String[] args) {
    String answer = "";
    String my_string="hello";
    int n = 3;
    char[] c = my_string.toCharArray();
    //= String[]s = my_string.split(""); 결과는 똑같다.
    // 위에는 char[]에 담는 것. 한글자씩 하기엔 char[]이 메모리적게먹어서 좋다
    for(char x: c){//{'h','e','l','l','o'}
      System.out.println(x);
       for(int i =0; i<n; i++){
        answer = answer+x;
       }
       System.out.println("여기까지 "+answer);
    }
  }
}
