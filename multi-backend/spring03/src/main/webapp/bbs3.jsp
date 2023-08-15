<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "bbsList",
				success : function(result) {
					$('#d1').html(result)
				},
				error : function() {
					alert('실패')
				}
			})
		}) //b1
		$('#b2').click(function() {
			$.ajax({
				url : "bbsList2",
				data : {
					page : 1
				},
				success : function(result) {
					$('#d1').html(result)
				},
				error : function() {
					alert('실패')
				}
			})
		}) //b2
		$('#b3').click(function() {
			$.ajax({
				url : "bbsList2",
				data : {
					page : 2
				},
				success : function(result) {
					$('#d1').html(result)
				},
				error : function() {
					alert('실패')
				}
			})
		}) //b2
	})
</script>
</head>
<body>
<h3>게시물 목록</h3>
<hr color="red">
<a href="bbsAll?page=1">
	<button class="button">게시판목록가지고오기</button>
</a>
<button id ="b1">페이징연습(1-5까지 가지고 오기)</button>
<button id ="b2">1페이지(1-5까지 가지고 오기)</button>
<button id ="b3">2페이지(6-10까지 가지고 오기)</button>
<div id="d1"></div>
</body>
</html>