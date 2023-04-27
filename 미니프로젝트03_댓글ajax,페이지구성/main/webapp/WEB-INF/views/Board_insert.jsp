<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
성공적으로 등록되었습니다.
<table>
	<tr>
		<td class="top">id</td>
		<td class="top">writer</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">regdate</td>
	</tr>
		<tr>
			<td class="down">${bag.board_id}</td>
			<td class="down"><a href="one.multi?board_id=${bag.board_id}">${bag.writer}</a></td>
			<td class="down">${bag.title}</td>
			<td class="down">${bag.content}</td>
			<td class="down">${bag.regdate}</td>
		</tr>
</table>