<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String won = request.getParameter("won"); //2600
	int won2 = Integer.parseInt(won);
	int dollar = 1323;
	int result = won2 / dollar; //2달러
%>
<%= result %>