<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%
   String tel = request.getParameter("tel");
   //01049121234, index는 0부터 시작
   //앞에 세글자를 추출하여, 각 조건에 맞게 값을 할당
   //010 --> 1111, 011 --> 2222, 나머지 --> 3333
   
   //subString(index) : index뒤를 다 추출
   //tel.subString(6) --> 21234(6~end)
   //subString(start, end+1) : start index부터 end index까지를 추출
   //tel.subString(6,9) --> 212(6~8)
   
   String tel2 = tel.substring(0, 3);
   //jsp는 servlet(java)코드로 변환되어서 처리, 
   //jsp의 모든 코드는 service()메서드안으로 자동 생성
   //지역변수는 초기화!!! --> 쓰레기값을 초기화
   String result = ""; //null
   if(tel2.equals("010")){
	 result = "1111"; //1111
   }else if(tel2.equals("011")){
	   result = "2222";  
   }else{
	   result = "3333";
   }
   //랜덤한 숫자 2자리를 만들어서 붙여줄 예정
   Random r = new Random();
   int no = r.nextInt(90) + 10; //0~89 + 10 ==> 10~99
   result = result + no;// "1111" + 10 ==> 111110
   //자바에서는 연산시 하나라도 String이면 결합연산자로 사용!
   %>
   <%= result %> 
   
   
   
   
   