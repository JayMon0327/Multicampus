<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%session.setAttribute("count", 0);%>
	시작 현재 카운트: <%=session.getAttribute("count") %>, ${count}
<hr color="red">서버에 세션 속성등록함. 
<a href="session속성가지고오기2.jsp">session속성가지고오기2.jsp</a>
</body>
</html>
