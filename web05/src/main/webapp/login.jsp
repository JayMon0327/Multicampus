<%@page import="bean.MemberDAO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 액션태그!!  -->
    <!-- spring: MemberDTO dto -->
    <jsp:useBean id="dto" class="bean.MemberDTO"></jsp:useBean> <!-- 1줄 -->
    <jsp:setProperty property="*" 			name="dto"/> <!-- 4줄 -->
    <!--             변수지정(*,모든 파라메터)		가방의 이름(빈, 객체의 이름) -->
    <!-- 받아서 가방에 넣은 변수 20개경우, 받는거 20줄, 가방에 넣는거 20줄 40줄을 대체!! -->
    <%
    
    	//1.입력: id,pw를 받아오자.
/*     	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	MemberDTO dto = new MemberDTO();
    	dto.setId(id);
    	dto.setPw(pw); */
    	
    	//2.처리: db처리(DAO, DTO)
    	MemberDAO dao = new MemberDAO();
    	boolean result = dao.login(dto); //boolean(true, false)
    	//로그인이 성공했으면 반드시 해주어야 하는 처리는 세션처리!!!!
    	String result2 = "로그인 실패";
    	if(result){
    		//브라우저와 서버와의 연결을 세션이라고 한다.
    		//세션이 유지되는 동안(로그아웃하기 전/브라우저를 닫기 전)
    		//id를 서버에 저장해두었다가 여러 페이지를 만들때 계속 사용하게 셋팅
    		//attribute == 속성, 특성, 특징
    		session.setAttribute("id", dto.getId());
    		result2 = "로그인 성공";
    	}
    	//3.출력: 결과를 출력
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div id = "total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<span class="text-bg-danger">로그인 결과: <%= result2 %> </span>
		<%if(session.getAttribute("id") != null) { %>
			<a href="logout.jsp">
				<button class="btn btn-outline-danger">로그아웃</button>
			</a>
		<%} %>
	</div>
</div>
</body>
</html>