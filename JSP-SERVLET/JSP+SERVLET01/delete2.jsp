<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--1.전달된 값 받아주세요(request이용) -->
    <!--2.dao에게 값 전달.(dao이용)생 -->
    <!--3.전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->
    <%
    String no = request.getParameter("no");

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판삭제</title>
<style type="text/css">
body{
background: blue;
color: white; 
}
</style>
</head>
<body>
게시판삭제확인
<hr color = red>
삭제한 게시판 번호: <%=no %> <br>

</body>
</html>