<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  type="text/css" href="resources/css/out3.css">
</head>
<body>
<h3 style=color:red>게시물 내용입니다.</h3>
<form action="transaction.do">
	id: <input type="text" name="id" value="spring"><br>
	pw: <input type="text" name="pw" value="spring"><br>
	name: <input type="text" name="name" value="spring"><br>
	tel: <input type="text" name="tel" value="spring"><br>
	제목: <input type="text" name="title" value="spring really?"><br>
	내용: <input type="text" name="content" value="fun spring"><br>
	작성자: <input type="text" name="writer" value="it's me!!"><br>
	<button type="submit">회원가입 완료</button>
</form>
</body>
</html>