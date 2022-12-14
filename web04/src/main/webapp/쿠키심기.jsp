<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1.쿠키객체 만들기
    	Cookie c1 = new Cookie("name", "hong");
    	Cookie c2 = new Cookie("age", "100");
    	
    	//2. 쿠키를 브라우저에 심는다.
    	//브라우저 <------ 서버 (response사용하면 됨.)
    	response.addCookie(c1);
    	response.addCookie(c2);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>브라우저에 쿠키 심었음</h3>
<a href="쿠키확인.jsp">쿠키확인하기</a>
</body>
</html>