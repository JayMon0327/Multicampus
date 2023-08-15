<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//로그아웃은 세션을 끊겠다는 의미
	session.invalidate();
	response.sendRedirect("member.jsp");
%>