package 문자열;
import java.util.*;
public class String에서Char배열에옮기기3 {
  public static void print(String[]s) {
    System.out.println(Arrays.toString(s));
  }
  public static void main(String[]args) {
    String sno = "2056521"; 
   
    //1. 마지막 위치의 숫자가 1이면 서대문구에서 출생,
    //  1이 아니면 다른 구에서 출생 프린트
    char result1 = sno.charAt(sno.length()-1); // lastIndexOf가능
    if(result1=='1'){
      System.out.println("서대문구에서 출생");
    }else{
      System.out.println("다른 구에서 출생");
    }
    //2. "52"를 추출하여 두 숫자를 더해보세요.
    //  더해서 10이넘지않아야 유효한 주민번호
    // 유효한 주민번호인지 아닌지 출력
    char[] two = new char[2];
    sno.getChars(4,5,two,0);
    //원본인 String인 sno에서 4~5을 추출해서
    //char[]인 two에 인덱스 0부터 넣어주세요.
    System.out.println(Arrays.toString(two));

    int i1 = Character.getNumericValue(two[0]);
    int i2 = Character.getNumericValue(two[1]);
    int sum = i1+i2;
    if(sum<10){
      System.out.println("유효한 주민번호입니다.");
    }else{
      System.out.println("유효한 주민번호가 아닙니다.");
    }

    //3. 주민번호에 포함된 5의 갯수를 출력(2가지방법)
    //1번방법 String안에 들어있는 데이터를 각각 분리(String 배열 - split())
    String[] stringarray = sno.split("");
    int count =0;
    for(String s:stringarray){//{"2","0","5","6","5","2","1"}
      if(s.equals("5")){
        count++;
      }
    }
    System.out.println(count);

    //2)charAt(i)
    //String sno = "2056521"
    int count2=0;
    for(int i=0; i<sno.length();i++ ){
      char c = sno.charAt(i);
      if(c=='5'){//타입이 기본형이면 == 가능하다 !! 
        count2++;
      }
    }
    System.out.println(count2);

    //1.인덱스를 빨리 찾는 방법(함수)
    System.out.println(Arrays.binarySearch(stringarray,"5"));

    //2.배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
    Arrays.fill(stringarray,0,3,"hoho");
    print(stringarray);

    //3.배열의 순서를 다 뒤집는 방법(역정렬)(함수)
    //Arrays로 내림차순을 할 수는 있으나 너무 복잡
    //-> 컬렉션으로 변환해서 하면 더 간단.
    List<String>list = Arrays.asList(stringarray);
    //한번 오름차순으로 정렬 한다음에 reverse로 내림차순 해준다.
    Collections.sort(list); //정렬(오름차순)
    Collections.reverse(list); // 정렬(내림차순)
    print(stringarray);

    //4.배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
    int count3 = Collections.frequency(list, "5");
    System.out.println(count3);
    }

    

  }

