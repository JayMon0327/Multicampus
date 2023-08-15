<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>메일화면</h3>
	<hr color="red">
	<!-- 세션은 특정한 브라우저와 서버와의 연결을 의미!! -->
	<!-- mail.jsp를 클릭했을 때, 1)로그인이 안되었으면, 로그인페이지로 자동으로 넘어가게 하고 -->
	<!--                      2)로그인이 되었으면, 로그인한 사람 누구인지 프린트!   -->
	<%
	if (session.getAttribute("id") != null) {
	%>
	로그인한 사람
	<%=session.getAttribute("id")%>
	<%
	} else {
	%>
		<script>
		alert("로그인 페이지로 넘어갑니다.");
		location.href = "login.html"
		</script>	
	<%
	//response.sendRedirect("login.html"); //페이지 자동 호출
	//브라우저야 login.html을 호출해!
	}
	%>
</body>
</html>