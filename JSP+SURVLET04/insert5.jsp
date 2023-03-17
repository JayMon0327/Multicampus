

<%@page import="multi.dietDAO2"%>
<%@page import="multi.dietDAO"%>
<%@page import="multi.dietVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 전달된 값 받아주세요.(request이용) -->
    <!-- 2. dao에게 값 전달.(DAO이용) 생략-->
    <!-- 3. 전달된 값을 출력하는 결과를 브라우저에 Html로 보내주세요.  -->
 <%
 	String no = request.getParameter("no"); 
 	String morning = request.getParameter("morning"); 
 	String lunch = request.getParameter("lunch"); 
 	String dinner = request.getParameter("dinner"); 
 	String img = request.getParameter("img"); 
 
 	dietVO bag = new dietVO();
    bag.setNo(no);
    bag.setMorning(morning);
    bag.setLunch(lunch);
    bag.setDinner(dinner);
    bag.setImg(img);
    
    
	//dao에게 가방을 전달하자.!
	dietDAO2 dao = new dietDAO2();
	dao.insert(bag);
 	
 	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
작성한 no : <%= no %> <br>
 morning : <%= morning %> <br>
 lunch : <%= lunch %> <br>
 dinner : <%= dinner %> <br>
 dinner : <%= img %> <br>
</body>
</html>