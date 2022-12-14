<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String dollar = request.getParameter("dollar"); //2
	int dollar2 = Integer.parseInt(dollar);
	int won = 1323;
	int result = dollar2 * won; //2646
%>
<%= result %>