<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>게시물등록 화면입니다. </h3>
<hr color="red">
<form action="Board_insert" method="get">
	writer : <input name="writer" value="jason"><br>
	title : <input name="title" value="오늘은~"><br>
	content : <input name="content" value="화요일~"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
 
<hr color="red">

</body>
</html>