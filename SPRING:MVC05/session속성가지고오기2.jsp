<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int count =(int)session.getAttribute("count");
	count++;
	session.setAttribute("count", count);
%>
현재 설정되어 있는 카운트
<hr color="red">
</body>
</html>