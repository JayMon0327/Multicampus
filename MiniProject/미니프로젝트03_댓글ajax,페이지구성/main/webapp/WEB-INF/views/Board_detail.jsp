<%@page import="com.multi.mvc901.BoardVO"%>
<%@page import="com.multi.mvc901.ComVO"%>
<%@page import="com.multi.mvc901.Owner_memberVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			content = $('#com').val()
			writer = "${id}"
			/* regdate = '${bag.regdate}' */
			$.ajax({
				url : "Board_insertcom",
				data : {
					board_id : '${bag.board_id}',
					content : content,
					writer : writer

				},
				success : function(x) {
					$('#result').load(location.href + ' #result')
					/* $('#result').empty();
					$('#result').append(x); */
					/* location.reload(); */
					/* $('#result').append(
						"- " + content + ", " + writer + "<br>") */
				},
				error : function() {
					alert('computer요청 실패!')
				}//error
			})//ajax
		})//b1
	})//$
</script>
<style>
@import url('https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap');
body{
font-family: 'IBM Plex Sans KR', sans-serif;
}
td {
	width: 200px;
	text-align: center;
}

.top0 {
	background: gray;
	color: green;
}

.top {
	background: white;
	color: black;
}

.down {
	
}

#id {
	text-align: center;
	position: absolute;
	right: 10px;
	top: 10px;
}

#search {
	position: absolute;
	right: 500px;
	top: 30px;
}

.main {
	position: relative;
	left: 430px;
}
</style>
</head>
<body>
	<h1 style="color: green;" class="main">
		<em><span style="border-bottom: 2px solid green;"><a
				href="board2.jsp">맛.zip</a></span></em>
	</h1>
	<form action="Board_one" method="get" id="search">
		<input name="board_id" value="2">
		<button type="submit">검색</button>
	</form>
	<h3 style="color: gray;" class="main">
		<em><span style="border-bottom: 2px solid gray;">사장님</span></em>
	</h3>
	<%
		if (session.getAttribute("id") != null) {
	%>
	<h3 style="color: green;">
		<em id="id">${id}님</em>
	</h3>
	<%
		} else {
	%><a href="owner_login.jsp">
		<button style="background: green;">로그인</button>
	</a>
	<a href="owner_member.jsp">
		<button style="background: pink;">회원가입화면으로go</button>
	</a>
	<%
		}
	%>
	<hr color="green">

	<table>
		<tr>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>매출,마진계산기</h4>
					</button>
			</a></td>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>맛 News</h4>
					</button>
			</a></td>
			<td class="top0"><a href="Board_list">
					<button style="background: grey;">
						<h4 style="color: green">자유게시판</h4>
					</button>
			</a></td>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>전문가QnA</h4>
					</button>
			</a></td>
			<td class="top0"><h4></h4></td>
			<td class="top0"><h4></h4></td>
		</tr>
	</table>
	<hr color="green">
	<h3>
		<strong>${bag.title}</strong>
	</h3>
	<h5>${bag.writer}</h5>
	<span>${bag.content}</span>

	<hr color="green">
	<div id="result">
		<h4>
			<b>댓글</b>
		</h4>
		<table>
			<c:forEach items="${Com_list}" var="bag">
				<tr>
					<td><em><span style="border-bottom: 2px solid green;">${bag.writer}</span></em><br>
						<br>${bag.content}<br>${bag.regdate}<hr></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<%
		if (session.getAttribute("id") != null) {
	%>
	<h5 style="color: green;" class="id">회원:${id}</h5>

	<input id="com">
	<button id="b1">작성</button>
	<br>
	<%
		} else {
	%>로그인시 작성가능<%
		}
	%>



	<hr color="green">
	<%
		//세션에서 값을 꺼내는 방법
	String id = (String) session.getAttribute("id");
	//모델에서 값을 꺼내는 방법
	//model.addAttribute("bag",bag)
	BoardVO bag = (BoardVO) request.getAttribute("bag");
	String writer = bag.getWriter();
	if (id != null) {
		if (id.equals(writer)) {
	%>
	<a href="update2.multi?no=${bag.board_id}">
		<button style="background: pink">수정</button>
	</a>
	<a href="delete2.multi?no=${bag.board_id}">
		<button style="background: pink">삭제</button>
	</a>
	<%
		}
	}
	%>
	<div>
		<table>
			<tr>
				<td class="top"><input type="hidden" id></td>
				<td class="top">제목</td>
				<td class="top">글쓴이</td>
				<td class="top">작성시간</td>
				<td class="top">조회수</td>
				<td class="top">좋아요</td>
			</tr>
			<c:forEach items="${Board_list}" var="bag">
				<tr>
					<td class="down"><input type="hidden" ${bag.board_id}></td>
					<td class="down"><a
						href="Board_detail?board_id=${bag.board_id}">${bag.title}</a></td>
					<td class="down">${bag.writer}</td>
					<td class="down">${bag.regdate}</td>
					<td class="down">${bag.viewscount}</td>
					<td class="down">${bag.likecount}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<!-- <form action="Board_like" method="get">
	<button>좋아요</button>
</form> -->
</body>
</html>