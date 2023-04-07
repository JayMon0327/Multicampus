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
<table>
	<tr>
		<td class="top">no</td>
		<td class="top">bbsno</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
	<c:forEach items="${list}" var="bag">
		<tr>
			<td class="down">${bag.no}</td>
			<td class="down"><a href="one2.multi?no=${bag.no}">${bag.bbsno}</a></td>
			<td class="down">${bag.content}</td>
			<td class="down">${bag.writer}</td>
		</tr>
	</c:forEach>
</table>