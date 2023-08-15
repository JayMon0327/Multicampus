<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>북마크등록</h3>
	<hr color = "red">
	<form action="bookInsert" method="get">
	name:<input name ="name"><br>
	url:<input name ="url"><br>
	img:<input name ="img"><br>
	<button type="submit">서버로전송</button>
	</form>
	
	<h3>북마크수정</h3>
	<hr color = "red">
	<form action="bookupdate" method="get">
	name:<input name ="name"><br>
	url:<input name ="url"><br>
	<button type="submit">서버로전송</button>
	</form>
	
	<h3>북마크삭제</h3>
	<hr color = "red">
	<form action="insert3.multi" method="get">
	name:<input name ="name"><br>
	url:<input name ="url"><br>
	img:<input name ="img"><br>
	<button type="submit">서버로전송</button>
	</form>
	
	<h3>북마크검색</h3>
	<hr color = "red">
	<form action="bookselect" method="get">
	name:<input name ="name"><br>

	<button type="submit">서버로전송</button>
	</form>
	
</body>
</html>
