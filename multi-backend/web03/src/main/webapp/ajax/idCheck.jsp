<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%
//data : {
//		id : idValue
//}
//idCheck.jsp?id=hong
	String id = request.getParameter("id");
	String[] list =  {"hong", "root", "admin"};
	String result = "가입 가능한 아이디입니다.";
	for(String s: list){ //==
		if(s.equals(id)){
			result = "이미 사용중 입니다. 사용불가능합니다.";
		}
	}
%><%-- 받은 데이터는 <%= id %> --%><%= result %>