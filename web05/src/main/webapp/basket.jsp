<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDTO"%>
<%@page import="bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 가방을 만들어서, ajax(브라우저)로 넘어온 값 받아서 가방에 넣어주세요.-->
    <jsp:useBean id="bag" class="bean.ProductDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <!-- jsp액션태그 -->
    <%
   /*  String id = request.getParameter("id");
    String price = request.getParameter("price");
    String title = request.getParameter("title");
    
    ProductDTO bag = new ProductDTO();
    bag.setId(id);
    bag.setPrice(price);
    bag.setContent(content); */
    %>
    <%
    //기존의 장바구니 리스트가 있었는지 없었는지 체크해보자.
    //ArrayList<ProductDTO> list
    //{dto, dto, dto}
    ArrayList<ProductDTO> list = null;
	String s = ""; //장바구니에 아무것도 없을때 찍어줄 메세지
    if(bag.getId() != null){
	    if(session.getAttribute("basket") == null){
	    	//장바구니에 넣은적이 없다.(0개)
	    	list = new ArrayList<ProductDTO>();
	    }else{ //2번째 이후부터 실행
	    	//장바구니에 넣은적이 있다.(1개 ==> 2개)
	    	list = (ArrayList<ProductDTO>)session.getAttribute("basket");//{dto}
	    }
	    list.add(bag);//{dto} ==> {dto, dto} ==> {dto, dto, dto}
	    session.setAttribute("basket", list); //{dto} ==> {dto, dto}
	    //어떤것이 들어가도 괜찮을 때 Object으로 바꾸어서 넣어줌.
    }else{ //null이면(넘어오는 값이 없으면)
		if (session.getAttribute("basket") == null) {
			s = "장바구니에 아무것도 들어있지 않음.";
		} else {
			list = (ArrayList<ProductDTO>) session.getAttribute("basket");
		}
	}

    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
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
	<% if(session.getAttribute("id") != null){ %>
		<%= session.getAttribute("id") %>님 장바구니 정보입니다.
		<hr>
		
		<a href="logout.jsp">
			<button class="btn btn-outline-danger">로그아웃</button>
		</a>
	<%} 
		if(session.getAttribute("basket") != null){
	%>
	<hr>
	<table class="table tablehover">
			<tr>
				<td>아이디</td>
				<td>물건이름</td>
				<td>가격</td>
				<td>주문하기</td>
			</tr>
		<%
			for(int i=0; i < list.size(); i++){
				ProductDTO dto = list.get(i);
		%>
		<tr>
				<td><%= dto.getId() %></td>
				<td><%= dto.getTitle() %></td>
				<td><%= dto.getPrice() %></td>
				<td>
					<a href="order.jsp?id=<%= dto.getId() %>">주문하기</a>
				</td>
			</tr>
		
		<%}//for
		}else{
		%>
		</table>
		<h3><%= s %></h3>
		<%	
		}
		%>
	</div>
</div>
</body>
</html>





