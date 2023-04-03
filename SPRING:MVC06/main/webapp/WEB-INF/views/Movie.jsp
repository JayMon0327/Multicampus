<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 컴퓨터 호출 했을때 결과담는 곳! -->
<style>
.top {
	background: pink;
	color: white;
}

.down {
	background: yellow;
	color: white;
}
</style>
<table border=1>
	<tr class="top">
		<td>영화제목</td>
		<td>영화가격</td>
	</tr>
	<tr class="down">
		<td>${vo.title}</td>
		<td>${vo.price}</td>
	</tr>
	
</table>
<a href="">문자인증받기</a>