<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    
    String id2 = "root";
    String pw2 = "pass";
    
    String result = "로그인 실패";
    if(id.equals(id2) && pw.equals(pw2)){
    	result = "로그인 성공";
    	//로그인이 성공하면
    	//세션(브라우저와 서버와의 연결 1개)
    	//1)로그아웃하기 전이나
    	//2)브라우저가 닫히기 전까지
    	//내 정보를 서버에 저장해두자.
    	//세션이 유지되는 동안 서버에 특정한 값들을 저장해두었다가
    	//아무때나 그 변수값을 꺼내 쓸 수 있음
    	session.setAttribute("id", id);
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과: <%= result %> <br>
세션으로 저장된 id의 값은 <%= session.getAttribute("id") %>

<hr color="green">
<a href="news.jsp">
	<button>뉴스사이트</button>
</a>

<a href="shopping.jsp">
	<button>쇼핑사이트</button>
</a>

<a href="mail.jsp">
	<button>메일사이트</button>
</a>









</body>
</html>