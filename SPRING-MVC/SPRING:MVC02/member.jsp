<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 화면입니다.</h3>
	<hr color="red">
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		name : <input name="name" value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<button type="button">먹통버튼(아무 기능이 없음)</button>

	<h3>회원수정 화면입니다.</h3>
	<hr color="red">
	<form action="update" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		name : <input name="name" value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<button type="button">먹통버튼(아무 기능이 없음)</button>
	
	<h3>회원탈퇴 화면입니다.</h3>
	<hr color="red">
	<form action="delete" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		name : <input name="name" value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<button type="button">먹통버튼(아무 기능이 없음)</button>
	
	<h3>회원검색 화면입니다.</h3>
	<hr color="red">
	<form action="one" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		name : <input name="name" value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<button type="button">먹통버튼(아무 기능이 없음)</button>
	
	<h3>회원배열 화면입니다.</h3>
	<hr color="red">
	<form action="list" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		name : <input name="name" value="park"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr color="red">
	<button type="button">먹통버튼(아무 기능이 없음)</button>
	
</body>
</html>
