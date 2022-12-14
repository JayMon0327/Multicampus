<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	ArrayList<ProductDTO> list = null;
	if(session.getAttribute("basket") != null){
		list = (ArrayList<ProductDTO>) session.getAttribute("basket");
%>
	장바구니 count: <%=  list.size()%>개
<%		
	}
%>

