<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String[] img_list = {
    			"1.png",
    			"2.png",
    			"3.png",
    			"4.png",
    			"5.png",
    			"6.png",
    			"7.png",
    			"8.png",
    			"9.png",
    			"10.png",
    			"11.png",
    			"12.png"
    };
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
<table class="table table-warning">
	<tr>
		<td>이미지명</td>
		<td>이미지</td>
	</tr>
	<% for(String s: img_list){ %> <!-- s: 1.png, s: 2.png  -->
	<tr>
		<td><%= s %></td>
		<td>
			<img src="img/<%= s %>" width="200" height="100">
		</td>
	</tr>
	<% } %>
</table>
</body>
</html>
















