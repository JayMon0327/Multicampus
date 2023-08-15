<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: lime;
}
td{
	width: 200px;
	text-align: center;
}
.top0{
	background: blue;
	color: white;
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
<table>
<tr>
	<td class="down">${bag.no}</td>
	<td class="down">
		<a href="one2.multi?no=${bag.no}">${bag.bbsno}</a></td>
	<td class="down">${bag.content}</td>
	<td class="down">${bag.writer}</td>
</tr>
</table>
</body>
</html>