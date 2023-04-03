<%@page import="com.multi.mvc02.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<h3>게시판검색 처리 요청이 완료되었습니다.</h3><br>
<hr color="red">

<table>
<tr>
	<td class="top0">${bag.no}</td>
	<td class="top0">${bag.title}</td>
	<td class="top0">${bag.content}</td>
	<td class="top0">${bag.writer}</td>
</tr>
</table>
<hr color="red">
<div id="result">
<table>
<tr>
	<td class="top">no</td>
	<td class="top">bbsno</td>
	<td class="top">content</td>
	<td class="top">writer</td>
</tr>
<c:forEach items="${list}" var="bag" >
<tr>
	<td class="down">${bag.no}</td>
	<td class="down">
		<a href="one2.multi?no=${bag.no}">${bag.bbsno}</a></td>
	<td class="down">${bag.content}</td>
	<td class="down">${bag.writer}</td>
</tr>
</c:forEach>
</table>
</div>
<hr color="red">
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록 페이지</a>
<%
//세션에서 값을 꺼내는 방법
String id=(String)session.getAttribute("id");
//모델에서 값을 꺼내는 방법
//model.addAttribute("bag",bag)
BbsVO bag =(BbsVO)request.getAttribute("bag");
String writer = bag.getWriter();
if(id !=null){
if(id.equals(writer)){
%>
<a href="update2.multi?no=${bag.no}">
	<button style="background: pink ">수정</button>
	</a>
<a href="delete2.multi?no=${bag.no}">
	<button style="background: pink ">삭제</button>
	</a>
	<%}else{ %>
<h3>게시판검색 처리 요청이 완료되었습니다.</h3><br>
${bag.no}<br>
${bag.title}<br>
${bag.content}<br>
${bag.writer}<br>
<%}} %>

</body>
</html>