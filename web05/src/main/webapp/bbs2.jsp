<%@page import="bean.BbsDTO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    BbsDAO dao = new BbsDAO();
    BbsDTO dto = new BbsDTO();
    
    dto.setId(request.getParameter("id"));
    
    BbsDTO bag = dao.one(dto);
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/project.css">
</head>
<body>
    <div id = "total"><!-- 전체 화면 을 묶음  -->
        <div id ="top"><!-- 메뉴가 들어가는 부분  -->
            <jsp:include page='top.jsp'></jsp:include>
        </div>
        <div id ="top2"><!-- 장바구니가 들어가는 부분 -->
            <jsp:include page="top2.jsp"></jsp:include>
        </div>
        <div id ="center"><!-- 메뉴 별 내용 부분 -->
            <table class="table table-hover">
                <thead>
                    <tr class="table-warning">
                        <th colspan="2"><%= bag.getWriter() %>님이 작성함</th>
                    <tr>
                </thead>
                <tbody>
                    <tr class="table-info">
                        <td>
                            제목
                        </td>
                        <td>
                            <%= bag.getTitle() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td>
                            내용
                        </td>
                        <td>
                            <%= bag.getContent() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td>
                            작성자
                        </td>
                        <td>
                            <%= bag.getWriter() %>
                        </td>
                    </tr>
                    <tr class="table-info">
                        <td colspan = "2">
                            <a href="bbs.jsp">
                                <button  class="btn btn-danger">리스트로</button>
                            </a>
                            <% 
                            //if(로그인한사람id랑 글작성한사람id와 동일한지체크)
                            if(session.getAttribute("id") != null){
                            	if(session.getAttribute("id").equals(bag.getWriter())) {
                            %>
	                            <a href="update.jsp?id=<%= bag.getId() %>">
	                                <button class="btn btn-secondary">수정</button>
	                            </a>
	                            <a href="delete.jsp?id=<%= bag.getId() %>">
	                                <button class="btn btn-dark">삭제</button>
	                            </a>
                            <%}}%>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>        
    </div>
</body>
</html>