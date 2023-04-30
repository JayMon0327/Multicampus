<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: yellow;
}
</style>
</head>
<body>
<h3> ${id}님! 로그인처리 성공 ! </h3>
<img src ="resources/img/yes.jpg" width=250 height=250>
	<a href="news.jsp">
	<button style="background: pink ">뉴스 화면으로 go</button>
	</a>
	<a href="board.jsp">
	<button style="background: pink ">게시판등록 화면으로 go</button>
	</a>
</body>
</html>