<%@page import="multi.MemberDAO6"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--1.전달된 값 받아주세요(request이용) -->
    <!--2.dao에게 값 전달.(dao이용)생 -->
    <!--3.전달된 값을 출력하는 결과를 브라우저에 html로 보내주세요.  -->
    <%
    String id = request.getParameter("id");

    MemberDAO6 dao = new MemberDAO6();
    dao.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
<style type="text/css">
body{
background: blue;
color: white; 
}
</style>
</head>
<body>
회원탈퇴확인
<hr color = red>
탈퇴한 ID: <%=id %> <br>

</body>
</html>