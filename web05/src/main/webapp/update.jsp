<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<%
//jsp에 자동import
//클릭하고 ctrl + shift + m 
BbsDAO dao = new BbsDAO();
BbsDTO dto = new BbsDTO();

dto.setId(request.getParameter("id"));

BbsDTO bag = dao.one(dto);
%>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			게시판 수정 화면
			<hr color="red">
			<%
			if (session.getAttribute("id") != null) {
			%>
			<span class="alert alert-success">
				<%=session.getAttribute("id")%>님 환영합니다.
			</span>
			<%
			}
			%>
			<hr color="blue">
			<form action="update2.jsp">
			<input type="hidden" name="id" value="<%= bag.getId() %>">
				<table border="1"  class="table table-hover">
					<tr  class="table-warning">
						<td width="200">제목</td>
						<td width="300"><input name="title" value="<%= bag.getTitle() %>"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">내용</td>
						<td width="300"><input name="content" value="<%= bag.getContent() %>"></td>
					</tr>
					<tr  class="table-warning">
						<td width="200">작성자</td>
						<td width="300">
						<!-- type="hidden"이면 input이 안보임. 값은 전달됨 -->
						<input 	name="writer" style="height: 100px;" 
								value="<%=session.getAttribute("id")%>" 
								readonly="readonly"
								disabled="disabled"
								>
						</td>
					</tr>
					<tr  class="table-warning">
						<td colspan="2">
							<button type="submit" class="btn btn-danger">글수정 완료</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
</html>