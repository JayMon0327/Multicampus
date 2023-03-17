
<%@page import="multi.dietVO"%>
<%@page import="multi.dietDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
dietDAO dao = new dietDAO();
//5,6) dao가 리턴한 BbsVO가 들어간 ArrayList를 받는다.
ArrayList<dietVO> list = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body></body>
총 다이어트실행: <%= list.size() %>
<%if(list.size()==0){ %>
<h3>다이어트 한날이 없습니다.</h3>
<img src ="img/empty.png" width=250 height="250">
<%}else{ %>
	<table class="table table-danger table-striped">
		<tr>
			<td>no</td>
			<td>morning</td>
			<td>lunch</td>
			<td>dinner</td>
			<td>img</td>
		</tr>
		<%
		for (dietVO bag2 : list) {
		%>
		<tr>
			<td><%= bag2.getNo()%></td>
			<td>
			<!--  one3.jsp?id=102 -->
			<a href="one5.jsp?id=<%=bag2.getNo()%>">
					<%=bag2.getMorning()%>
			</a></td>
			<td><%=bag2.getLunch()%></td>
			<td><%=bag2.getDinner()%></td>
			<td><img src = "img/<%=bag2.getImg()%>" width=150 height=150>
			</td>

		</tr>
		<%
		} //for
		%>
		<%} %>
	</table>
</body>
</html>