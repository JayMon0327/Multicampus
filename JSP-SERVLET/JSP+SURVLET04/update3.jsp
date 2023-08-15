
<%@page import="multi.dietDAO"%>
<%@page import="multi.dietVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String no = request.getParameter("no"); //"apple"
    String lunch = request.getParameter("lunch"); //"010"
    //가방을 만들어서 값들을 넣고(set)!
   	dietVO bag = new dietVO();
    bag.setNo(no);
	bag.setLunch(lunch);
	
	
	//dao에게 가방을 전달하자.!
	dietDAO dao = new dietDAO();
	dao.update(bag);
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html 코드가 미리 들어가있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: lime;
}
</style>
</head>
<body>
당신이 수정을 원하는 일자는 <%=no %>
당신이 수정을 원하는 점심 식단은 <%=lunch %>입니다.
</body>
</html>