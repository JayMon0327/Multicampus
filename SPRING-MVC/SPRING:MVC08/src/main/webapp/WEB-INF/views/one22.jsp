<%@page import="com.multi.mvc200.BbsVO"%>
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
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때, 
		//입력값으로 넣은 함수를 실행해주세요.
		//alert("월컴...월요일~~~")
		$('#b1').click(function() {
			content = $('#reply').val()
			writer = "apple"
			$.ajax({
				url : "insert4",
				data : {
					content : content,
					bbsno : '${bag.no}',
					writer : writer
				},
				success : function(x) {
					$('#result').append("- " + content + ", " + writer + "<br>")
				},
				error : function() {
					alert('computer요청 실패!')
				} //error
			}) //ajax
		})//b2
	}) //$
	</script>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<a href="bbs.jsp">처음페이지로</a>
<a href="list2">게시물 전체 목록페이지</a>
<hr color="red">

게시물검색 처리 요청이 완료되었습니다.
<br>
${bag.no}, ${bag.title}, 
${bag.content}, ${bag.writer}
<hr color="red">
댓글달기 <input id="reply"> <button id="b1">댓글달기</button><br>

<hr color="blue">
<div id="result">
<!-- for-each를 이용해 댓글 목록을 프린트!! -->
	<c:forEach items="${list}" var="bag"> 
	- ${bag.content}, ${bag.writer} <br>
	</c:forEach>
</div>
</body>
</html>