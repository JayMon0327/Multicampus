<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<!-- 세션이 null이면 저장이 안되었다라는 의미!! 
			로그인하는 페이지보여주세요. -->
			<%
			if (session.getAttribute("id") == null) {
			%>
			<form action="login.jsp">
				<table border="1" bordercolor='red' class="table table-striped">
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" class="form-control"></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="text" name="pw" class="form-control"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" class="btn btn-warning"
								style="width: 250px;">로그인처리</button>
						</td>
					</tr>
				</table>
 			</form>
			<hr color="blue">
			<%
			} else { //로그인되었으면(세션이 널이 아니면!)
			%>
			<a href="logout.jsp">
				<button class="btn btn-outline-danger">로그아웃</button>
			</a>
			<%	
			}
			%>
			<span class="badge bg-primary">중요!!</span> <span class="btn btn-info"
				style="width: 300px;">회원 가입 정보 입력</span> <br>
			<br>
			<form action="member2.jsp">
				<table border="1" bordercolor='red' class="table table-dark">
					<tr>
						<td>아이디</td>
						<td><input type="text" name="id" class="form-control"></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="text" name="pw" class="form-control"></td>
					</tr>
					<tr>
						<td>이름</td>
						<td><input type="text" name="name" class="form-control"></td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td><input type="text" name="tel" class="form-control"></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" style="width: 250px;"
								class="btn btn-warning">회원가입처리</button>
						</td>
					</tr>
				</table>
			</form>


		</div>
	</div>
</body>









</html>