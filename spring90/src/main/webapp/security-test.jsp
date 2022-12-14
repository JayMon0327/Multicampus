<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="sInsert.do">
		아이디: <input type="text" name="id"><br>
		패스워드: <input type="text" name="pw"><br>
		이름: <input type="text" name="name" value="hong"><br>
		전화: <input type="text" name="tel" value="011"><br>
		<input type="submit" value="회원가입">
	</form>
<hr color="red"><br>
	<form action="sLogin.do">
		아이디: <input type="text" name="id"><br>
		패스워드: <input type="text" name="pw"><br>
		<input type="submit" value="회원로그인">
	</form>
</body>
</html>