<%@page import="db_connect.MemberDAO"%>
<%@ page import="db_connect.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//1)입력
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//2)db처리
		MemberVO bag = new MemberVO();
		bag.setId(id);
		bag.setPw(pw);
		
		MemberDAO dao = new MemberDAO();
		int result = dao.login(bag); //1 or 다른값
		
		//3)출력(html)
		String result2 = "로그인 실패";
		if(result == 1){
			result2 = "로그인 성공";
			//자동으로 회원정보를 보여주는 페이지로 자동 넘김!
			//브라우저에 회원정보 보여주는 페이지를 호출해(명령)
			response.sendRedirect("http://localhost:8989/web01/member_one.jsp?id=" + id);
		}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 결과 : <%= result2 %>
</body>
</html>