<%@page import="multi.studentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.studentVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	studentDAO dao = new studentDAO();
	dao.insert(bag);
%>