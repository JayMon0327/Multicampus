<%@page import="db_connect.ProductVO"%>
<%@page import="db_connect.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 입력 -- 처리 -- 출력 -->
<%
ProductDAO dao = new ProductDAO();
ArrayList<ProductVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<style type="text/css">
th{
background-color: lime;
color: blue;
}
</style>
</head>
<body>
	<h3>
		물건의 전체 개수 :
		<%=list.size()%>개
	</h3>
	<table border="1" class="table table-hover">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>이미지</th>
		</tr>
		<%
		for (ProductVO bag: list) {
		%>
		<tr>
			<td><%=bag.getID()%></td>
			<td>
			<a href="http://localhost:8989/web01/product_one.jsp?id=<%=bag.getID()%>">
				<%=bag.getNAME()%>
			</a>
			</td>
			<td>
				<%= bag.getCONTENT() %>
			</td>
			<td>
				<img alt="" src="img/<%=bag.getIMG()%>" width="150" height="150">
			</td>
		</tr>

		<%
		} //for
		%>
	</table>
</body>
</html>









