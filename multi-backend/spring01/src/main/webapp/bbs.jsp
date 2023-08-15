<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/out.js"></script>
<script type="text/javascript">
/* out.js에 있는 go함수 호출!하여 실행! */
//go()
</script>
</head>
<body>
게시판페이지입니다.<br>

<hr> 
<h3>게시판 글쓰기</h3>
<a href="one?id=100">100번 검색</a> <br>
<a href="one?id=101">101번 검색</a> <br>
<a href="one?id=102">102번 검색</a> <br>
<hr> 
<h3>게시판 글쓰기</h3>
<form action="insert2.multi">
	title : <input name="title"> <br>
	content : <input name="content"> <br>
	writer : <input name="writer"> <br>
	<button>서버로 전송</button>
</form>
<hr> 
<h3>게시판 글삭제</h3>
<form action="delete2.multi">
	id : <input name="id" value="test"> <br>
	<button>서버로 전송</button>
</form>
</body>
</html>