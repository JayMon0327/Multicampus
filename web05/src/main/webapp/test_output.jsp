<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dto" class="bean.TestDTO"></jsp:useBean>
    <jsp:setProperty property="id" name="dto"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=  dto.getId() + 100%>
</body>
</html>