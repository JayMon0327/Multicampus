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
		<td class="top">id</td>
		<td class="top">pw</td>
		<td class="top">name</td>
		<td class="top">tel</td>
	</tr>
		<tr>
			<td class="down">${bag.id}</td>
			<td class="down"><a href="one.multi?no=${bag.id}">${bag.pw}</a></td>
			<td class="down">${bag.name}</td>
			<td class="down">${bag.tel}</td>
		</tr>
</table>