<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
<jsp:setProperty property="id" name="dto" />
<%
BbsDAO dao = new BbsDAO();
int result = dao.delete(dto);
if (result == 1) {
%>
<script>
	alert('삭제가 완료되었습니다.')
	location.href = "bbs.jsp";
</script>
<%
} else {
%>
<script>
	alert('삭제중 문제가 생겼습니다.')
</script>
<%
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="bbs.jsp">
		<button class="btn btn-danger">리스트로</button>
	</a>
</body>
</html>