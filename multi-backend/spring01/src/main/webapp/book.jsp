<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/out.css">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>

<!-- Popper JS -->
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
북마크페이지입니다.<br>
<hr>
<h3>북마크 전체 검색하기</h3>
<a href="list.multi">전체 검색</a>

<hr>
<h3>북마크 검색하기</h3>
<a href="one3.multi?id=2">2번 북마크 검색</a><br>
<a href="one3.multi?id=3">3번 북마크 검색</a><br>
<form action="one3.multi">
	id : <input name="id"> <br>
	<button class="btn btn-danger">북마크 검색</button>
</form>
<hr>
<h3>북마크 삭제하기</h3>
<a href="delete3.multi?id=1">1번 북마크 삭제</a><br>
<a href="delete3.multi?id=2">2번 북마크 삭제</a><br>
<a href="delete3.multi?id=3">3번 북마크 삭제</a><br>

<hr> 
<h3>북마크 글쓰기</h3>
<form action="insert3.multi">
	name : <input name="name"> <br>
	url : <input name="url"> <br>
	img : <input name="img"> <br>
	<button  class="btn btn-danger">서버로 전송</button>
</form>
<hr> 
</body>
</html>