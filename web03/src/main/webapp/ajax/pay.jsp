<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //location.href = "pay.jsp?money=" + rsp.paid_amount
	String money = request.getParameter("money");    
	String no = request.getParameter("no");    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결제금액은 : <%= money  %>원 <br>
승인번호는 : <%= no %> 번
</body>
</html>