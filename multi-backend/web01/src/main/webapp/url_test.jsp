<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String[] id_list = {"apple", "park", "friday"};
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	<a href="http://localhost:8989/web01/member_one.jsp?id=park">park인 사람의 정보</a> <br>
	<a href="http://localhost:8989/web01/member_one.jsp?id=apple">apple인 사람의 정보</a> <br>
	<a href="http://localhost:8989/web01/member_one.jsp?id=friday">friday인 사람의 정보</a> <br> 
	-->
<%
	//배열에 있는 사용자를 모두 링크할 수 있는 html코드를 만들어보세요.
	//for문 사용해야함.
	for(String s: id_list){ //s = "apple", s = "park", s = "friday"
%>
 <a href="http://localhost:8989/web01/member_one.jsp?id=<%= s %>"><%= s %>인 사람의 정보</a> <br>
 
<% } %>
</body>
</html>






