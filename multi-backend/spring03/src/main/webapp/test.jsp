<%@page import="java.util.ArrayList"%>
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
	ArrayList list = new ArrayList();
	list.add(0, 1);
	list.add(1, 1);
	list.add(2, 2);
	list.add(3, 3);
	list.add(3, 33);
	
	out.print(list);
%>
</body>
</html>