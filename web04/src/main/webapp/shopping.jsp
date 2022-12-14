<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>쇼핑화면</h3>
<hr color="red">
로그인한 사람 <%= session.getAttribute("id") %> <br>
<%
//null이 아니라는 의미는 id로 저장된 세션값이 있다라는 얘기, 로그인이 되었다라는 의미
	if(session.getAttribute("id") != null){
%>
<ul>
	<li>운동화</li>
	<li>커피</li>
	<li>물1병</li>
</ul>
<%
	}else{
%>
	<script type="text/javascript">
		alert('로그인화면으로 넘어갑니다.')
		location.href = "login.html"
	</script>
<%		
	}
%>
</body>
</html>








