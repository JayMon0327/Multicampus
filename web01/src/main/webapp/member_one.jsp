<%@page import="db_connect.MemberVO"%>
<%@page import="db_connect.MemberDAO"%>
<%@page import="db_connect.BbsVO"%>
<%@page import="db_connect.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    1. 데이터 받아오기
    2. db처리
    3. 결과출력(html)
     -->
     <%
     	String id = request.getParameter("id");
     
     
		MemberDAO dao = new MemberDAO();
		MemberVO bag = dao.one(id);
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
</head>
<body>
<h3><%= bag.getName() %>님의 회원정보입니다.</h3>
<%-- 번호 : <%= bag.getNo() %> <br>
제목 : <%= bag.getTitle() %><br>
내용 : <%= bag.getContent() %><br>
작성자 : <%= bag.getWriter() %><br> --%>

<table class="table-dark table">
	<tr>
		<td>항목명</td>
		<td>데이터</td>
	</tr>
	<tr>
		<td>아이디</td>
		<td>
			<%= bag.getId() %>
		</td>
	</tr>
	<tr>
		<td>패스워드</td>
		<td>
			<%= bag.getPw() %>
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>
			<%= bag.getName()%>
		</td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td>
			<%= bag.getTel() %>
		</td>
	</tr>
	
</table>



















</body>
</html>