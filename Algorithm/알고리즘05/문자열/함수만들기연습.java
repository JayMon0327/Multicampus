package 문자열;


public class 함수만들기연습 {
 public static void 세수하기() {
  System.out.println("일어나서 거울보고");
  System.out.println("클렌징폼을 손에 덜어서");
  System.out.println("얼굴을 닦는다.");
 } 
 public static void 아침먹기(String when) {
  System.out.println("프라이팬에 계란을 올리고");
  System.out.println("스팸을 올려서");
  System.out.println("냠냠" + when+"먹는다");
 }
 public static void 운동하기운동장(String location) {
  System.out.println("운동장으로 나와서");
  System.out.println("러닝운동을"+location+"에서 한다");
 }
 public static void 잠자기() {
  System.out.println("잠을 존나게 잔다.");
  System.out.println("진짜 존나게");
 }
 public static void 점심먹기(String when) {
  System.out.println("식탁에 앉아서");
  System.out.println("점심메뉴를 주문한다");
  System.out.println("맛잇게 "+when+"먹는다.");
 }
 public static void 외출준비() {
  System.out.println("머리드라이를 하고");
  System.out.println("옷을입는다");
 }
 public static void 화장하기() {
  System.out.println("화장을 왜해");
  System.out.println("남자가 되가지고");
 }
 public static void 저녁먹기(String when) {
  System.out.println("밖으로 나간김에");
  System.out.println("술한잔 하자고");
  System.out.println(when+"먹으면서");
 }
 public static void 운동하기공원() {
  System.out.println(" 공원에 가서");
  System.out.println("취중운동 찢어보자");
 }
 public static void 저녁잠자기() {
  System.out.println("불을끄고");
  System.out.println("꿀잠을 자보자고");
 }
  public static void main(String[]args) {
    //메서드(방법을 정의,함수 --> 메서드
    세수하기();
    아침먹기("아침");
    운동하기운동장("운동장");
    잠자기();
    점심먹기("점심");
    세수하기();
    화장하기();
    저녁먹기("저녁");
    운동하기공원();
    저녁잠자기();

  }
}
