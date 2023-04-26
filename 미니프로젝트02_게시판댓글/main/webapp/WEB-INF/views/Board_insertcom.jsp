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
	<td class="down">${bag.board_id}</td>
			<td class="down">${bag.writer}</td>
			<td class="down"><a href="Board_one?board_id=${bag.board_id}">${bag.title}</a></td>
			<td class="down">${bag.content}</td>
			<td class="down">${bag.regdate}</td>
			<td class="down">${bag.updatedate}</td>
			<td class="down">${bag.deletedate}</td>
			<td class="down">${bag.viewscount}</td>
			<td class="down">${bag.likecount}</td>
</tr>
</table>
</body>
</html>