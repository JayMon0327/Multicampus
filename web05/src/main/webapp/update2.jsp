<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:useBean id="dto" class="bean.BbsDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="dto"/>
    
    <%
    	BbsDAO dao = new BbsDAO();
    	int result = dao.update(dto);
    	if(result == 1){
    %>
    	<script type="text/javascript">
			alert('게시물 수정이 완료되었습니다.')
			location.href="bbs.jsp"
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
게시물 수정에 문제가 생겼습니다.
</body>
</html>