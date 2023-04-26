<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<style>
td{
	width: 200px;
	text-align: center;
}
.top0{
	background: gray;
	color: white;
}
.top{
	
}
.down{
	
}

</style>
<h1 style= "color:green;"><em><span style="border-bottom: 2px solid green;"><a href="board2">맛.zip</a></span></em></h1>
<h3 style= "color:gray;"><em><span style="border-bottom: 2px solid gray;">사장님</span></em></h3>
<form action="Board_one" method="get">
검색어 : <input name="board_id" value="2"><button type="submit">검색</button>
</form>
<% if(session.getAttribute("id")!=null){ %>
<h3 style= "color:green;" class="id">${id}님</h3>
<%}else{ %><a href="owner_login.jsp">
<button style="background:green;">로그인</button>
</a><a href="owner_member.jsp">
<button style="background:pink;">회원가입화면으로go</button>
</a><%} %>
<hr color="green">
<table>
	<tr>
		<td class="top0"><a href="owner_login">
		<button style="background:gray;"><h4>매출,마진계산기</h4></button></a></td>
		<td class="top0"><a href="owner_login">
		<button style="background:gray;"><h4>맛 News</h4></button></a></td>
		<td class="top0"><a href="Board_list">
		<button style="background:grey;"><h4 style="color:green">자유게시판</h4></button></a></td>
		<td class="top0"><a href="owner_login">
		<button style="background:gray;"><h4>전문가QnA</h4></button></a></td>
		<td class="top0"><h4></h4></td>
		<td class="top0"><h4></h4></td>
	</tr>
	</table>
	<hr color="green">
<table>
	<tr>
		<td class="top"><input type="hidden"id></td>
		<td class="top">제목</td>
		<td class="top">글쓴이</td>
		<td class="top">작성시간</td>
		<td class="top">조회수</td>
		<td class="top">좋아요</td>
	</tr>
	<c:forEach items="${Board_list}" var="bag">
		<tr>
			<td class="down"><input type="hidden" ${bag.board_id}></td>
			<td class="down"><a href="Board_detail?board_id=${bag.board_id}">${bag.title}</a></td>
			<td class="down">${bag.writer}</td>
			<td class="down">${bag.regdate}</td>
			<td class="down">${bag.viewscount}</td>
			<td class="down">${bag.likecount}</td>
		</tr>
	</c:forEach>
</table>