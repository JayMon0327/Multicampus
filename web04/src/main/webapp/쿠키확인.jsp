<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //{c1, c2}
    //쿠키는 브라우저에 저장되었기 때문에 모두 다 서버로 가지고 온다.
    //쿠키배열로 가지고 온다.
    	Cookie[] cookies = request.getCookies();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쿠키의 개수: <%= cookies.length %>개 <br>
	<% for(Cookie c: cookies){ %>
		쿠키이름 <%= c.getName() %>, 쿠키값 <%= c.getValue() %> <br>
	<%}%>
</body>
</html>