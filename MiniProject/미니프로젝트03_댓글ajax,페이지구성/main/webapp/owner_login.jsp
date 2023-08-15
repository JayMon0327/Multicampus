<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <% if(session.getAttribute("id")== null){ %> --%>
<h1 style= "color:green;">맛집.zip</h1>
	<hr color="green">
	<form action="owner_login" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input name="pw" value="1234"><br> 
		<button type="submit" style="background:green;">로그인</button>
	</form>
	<%-- <%}else{%> --%>
	<hr color ="green">
	<h1 style= "color:green;">${id}님이 로그인 중입니다 ~!</h1>
	
	<a href="board2.jsp">
	<button style="background: grey ">게시판 화면으로 go</button>
	</a>
	<a href="news.jsp">
	<button style="background: grey ">뉴스 화면으로 go</button>
	</a>
	<a href="cafe.jsp">
	<button style="background: grey ">카페 화면으로 go</button>
	</a>
	<%-- <%} %> --%>
	
</body>
</html>