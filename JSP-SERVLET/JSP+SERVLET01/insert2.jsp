<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--1.전달된 값 받아주세요(request이용) -->
    <!--2.dao에게 값 전달.(dao이용)생 -->
    <!--3.전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->
    <%
    String no = request.getParameter("no");
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    String writer = request.getParameter("writer");
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글작성확인</title>
<style type="text/css">
body{
background: blue;
color: white; 
}
</style>
</head>
<body>
게시판 글 작성완료
<hr color = red>
작성번호: <%=no %> <br>
제목: <%=title %> <br>
내용: <%=content %> <br>
작성자: <%=writer %> 
</body>
</html>