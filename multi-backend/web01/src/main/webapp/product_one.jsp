<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
    1. 데이터 받아오기
    2. db처리
    3. 결과출력(html)
     -->
<%
String id = request.getParameter("id");

ProductDAO dao = new ProductDAO();
ProductVO bag = dao.one(id);
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
	<h3><%=bag.getID()%>번호 물건 검색된 결과입니다.
	</h3>
	<hr>
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
			<td>번호</td>
			<td><%=bag.getID()%></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><%=bag.getNAME()%></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><%=bag.getCONTENT()%></td>
		</tr>
		<tr>
			<td>이미지</td>
			<td>
				<img alt="" src="img/<%=bag.getIMG()%>">
			</td>
		</tr>
	</table>



















</body>
</html>