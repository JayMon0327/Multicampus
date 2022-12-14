<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1) 데이터를 받아서, vo에 넣으세요.
    		1-1) vo를 만들자
    		MemberDTO dto = new MemberDTO();
    		1-2) vo에 받은 데이터를 다 넣자.
     -->
     <!-- jsp만의 특별한 태그(액션태그): 특정한 처리를 해줌 -->
     <!-- 태그명앞에 다른 태그들과 구분하기 위해서 이름을 써준다.
     	  namespace(이름공간)
      -->
     <jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean>
     <jsp:setProperty property="*" name="dto"/>
    <!-- 2) dao에 insert(vo)를 요청 -->
    <%
    	MemberDAO dao = new MemberDAO();
    	int result = dao.insert(dto); //1, 0
    	if(result == 1){
    		response.sendRedirect("member.jsp");
    	}else{
    		out.print("<h3>회원가입시 에러가 발생했습니다.</h3>");
    	}
    %>
    <!-- 3) insert결과에 따라서 성공하면 member.jsp로 페이지 자동 넘김 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>