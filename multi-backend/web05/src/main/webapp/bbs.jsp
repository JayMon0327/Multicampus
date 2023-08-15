<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
BbsDAO dao = new BbsDAO();
ArrayList<BbsDTO> bag = dao.list();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/project.css">
</head>
<body>
	<div id="total">
		<!-- 전체 화면 을 묶음  -->
		<div id="top">
			<!-- 메뉴가 들어가는 부분  -->
			<jsp:include page='top.jsp'></jsp:include>
		</div>
		<div id="top2">
			<!-- 장바구니가 들어가는 부분 -->
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<!-- 메뉴 별 내용 부분 -->
			<br>
			<%
			if (session.getAttribute("id") != null) {
			%>
			<span class="alert alert-success"> <%=session.getAttribute("id")%>님
				환영합니다.
			</span>&nbsp;&nbsp;&nbsp; <a href="insert.jsp">
				<button  class="btn btn-danger">글쓰기</button>
			</a> <a href="logout.jsp">
			<button class="btn btn-outline-danger">로그아웃</button>
		</a>
			<%
			}
			%>
<br><br>
			<table border="1" class="table table-hover">
				<thead>
					<tr class="table-warning">
						<td>게시글</td>
						<td>내용</td>
						<td>작성자</td>
					</tr>
				</thead>
				<tbody>
					<%
					for (BbsDTO dto : bag) {
					%>
					<tr class="table-info">
						<td><%=dto.getTitle()%></td>
						<td><a href="bbs2.jsp?id=<%=dto.getId()%>"> <%=dto.getContent()%>
						</a></td>
						<td><%=dto.getWriter()%></td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>