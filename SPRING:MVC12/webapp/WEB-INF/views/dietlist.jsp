<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: white;
}
td{
	width: 250px;
	text-align: center;
}
.top{
	background: black;
	color: white;
}
.down{
	background: pink;
}
</style>
</head>
<body>

<h3>검색완료</h3> <br>
<a href="diet.jsp">메인 페이지로</a>
<hr color = "red">
<table>
<tr>
	<td class="top">no</td>
	<td class="top">morning</td>
	<td class="top">lunch</td>
	<td class="top">dinner</td>
	<td class="top">img</td>
</tr>
<c:forEach items="${list}" var="vo">
<tr>
	<td class="down">${vo.no}</td>
	<td class="down">
		<a href="bookselect?id=${vo.no}">${vo.morning}</a></td>
	<td class="down">
		<a href="${vo.lunch}">${vo.lunch}</a></td>
	<td class="down">
		${vo.dinner}</td>
	<td class="down"><img src ="resources/img/${vo.img}" width=200 height=200></td>
</tr>
</c:forEach>


</body>
</html>