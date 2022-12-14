<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-latest.min.js"></script>

<link rel="stylesheet" href="css/project.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<%
			if (session.getAttribute("id") != null) {
			%>
			<%=session.getAttribute("id")%>님 환영합니다. <a href="logout.jsp">
				<button class="btn btn-outline-danger">로그아웃</button>
			</a>
			<%
			}
			%>
			<hr color="blue">
			<!-- 1) dao이용해서 상품목록 다 가지고 오자. -->
			<jsp:useBean id="dto" class="bean.ProductDTO"></jsp:useBean>
			<jsp:setProperty property="id" name="dto" />
			<%
			//전달된 id를 받아서 dto를 만들어서 넣으세요.!!
			ProductDAO dao = new ProductDAO();
			ProductDTO dto2 = dao.one(dto);
			%>
			<script type="text/javascript">
				$(function() {
					$('#basket').click(function() {
						$.ajax({
							url: "basket.jsp",
							data : {
								id : '<%= dto2.getId() %>',
								price : '<%= dto2.getPrice() %>',
								title : '<%= dto2.getTitle() %>' 
							},
							success: function() {
								alert(<%= dto2.getId() %> + "번 제품이 장바구니에 추가되었습니다.")
								choice = confirm('장바구니 페이지로 이동하시겠습니까') 
								if(choice){ //choice에 true이면
									location.href = 'basket.jsp'
								}
							}
						})
					})
				})
</script>
			<span class="badge bg-success" style="font-size: 20px;">상품상세정보</span>
			<hr>
			<!-- 2) 가지고 온 데이터를 테이블로 만들어 보여주자. -->
			<table border="1" class="table table-hover">
				<tr class="table-info">
					<td rowspan="5" class="table-info"><img alt="상품이미지"
						src="img/<%=dto2.getImg()%>" height="400" width="500"></td>
					<td><span class="alert alert-danger">상품아이디: <%=dto2.getId()%>
					</span></td>
				</tr>
				<tr class="table-info">
					<td><span class="alert alert-danger">상품제목: <%=dto2.getTitle()%>
					</span></td>
				</tr>
				<tr class="table-info">

					<td><span class="alert alert-success">상품설명: <%=dto2.getContent()%>
					</span></td>
				</tr>
				<tr class="table-info">
					<td><span class="alert alert-success">상품가격: <%=dto2.getPrice()%>원
					</span></td>

				</tr>
				<tr class="table-info">
					<td><span class="alert alert-success">상품회사: <%=dto2.getCompany()%>
					</span></td>
				</tr>
				<!-- dto2의 내용을 테이블모양으로 보여주자.  -->
				<tr>
					<td colspan="2" class="alert alert-Warning">
						<button class="btn btn-primary" id="basket">장바구니</button>
						<button class="btn btn-success">주문하기</button>
					</td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>