<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>음식 선택 화면입니다.</h3>
	<hr color = "red">
	<form action="food" method="get">
	좋아하는음식:<input name ="like" value="햄버거"><br>
	싫어하는음식:<input name ="dislike" value="커피"><br>
	<button type="submit">선택</button>
	</form>
	
</body>
</html>
