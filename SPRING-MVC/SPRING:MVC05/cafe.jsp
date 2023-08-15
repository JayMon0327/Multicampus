<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="resources/img/ham.png"><br>

<%
if(session.getAttribute("id") !=null){ //로그인이 성공 이라는 뜻 !
%>
<a href="bbb">공동구매 참여</a>
<%}else{ %> <!-- 로그인을 안했다라는뜻! -->
	<a href="login.jsp">로그인 페이지로</a>
<%} %>
</body>
</html>