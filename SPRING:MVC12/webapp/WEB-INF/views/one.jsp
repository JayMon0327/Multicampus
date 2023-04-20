<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	width: 200px;
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
<a href="member.jsp">메인 페이지로</a>
<hr color = "red">
<table>
<tr>
	<td class="top">id</td>
	<td class="top">pw</td>
	<td class="top">name</td>
	<td class="top">tel</td>
</tr>
<tr>
	<td class="down">${bag.id}</td>
	<td class="down">
		<a href="one?id=${bag.id}">${bag.pw}</a></td>
	<td class="down">
		<a href="${bag.name}">${bag.name}</a></td>
	<td class="down">${bag.tel}</td>
	</tr>
</body>
</html>