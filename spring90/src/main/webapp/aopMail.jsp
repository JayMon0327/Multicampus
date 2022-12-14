<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="aopError.do">AOP에러 발생!!!</a>
<form action="email.do">
<%
	pageContext.setAttribute("id", "hera");
%>
	<input type="text" value="${id}@naver.com" name="email">
	<input  type="submit" value="넘어간다..">
</form>

</body>
</html>