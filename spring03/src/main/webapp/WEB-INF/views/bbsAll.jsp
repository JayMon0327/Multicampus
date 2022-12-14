<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/menuCss.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>


</head>
<body>
<h3>전체 게시물 count>> ${count}개</h3>
<%
//model의 속성값을 꺼낼 때는 request.getAttribute("모델명");
	int pages = (int)request.getAttribute("pages");
	//Object으로 자동형변환되어 들어가 있던 것을 int의 모든 기능을 사용하고자하는 경우에는
	//다시 int로 변경해주어야 함.
	//Object <-- Integer <--오토박싱(포장)/오토언박싱-> int
	//Integer(포장클래스(Wrapper class 기본형을 가지고 포장해서 만든 클래스) <<----- int(기본형)
	for(int p = 1; p <= pages; p++){
%>
	<a href="bbsAll?page=<%= p %>">
		<button style="background: lime; color: red; font-weight: bold;"><%= p %></button>
	</a>
<%		
	}
%>
<table class="table">
	<tr>
		<td>bbs_no</td>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>
	<c:forEach items="${list}" var="one">
	<tr>
		<td>${one.bbs_no}</td>
		<td>${one.id}</td>
		<td>${one.title}</td>
		<td>${one.content}</td>
		<td>${one.writer}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
