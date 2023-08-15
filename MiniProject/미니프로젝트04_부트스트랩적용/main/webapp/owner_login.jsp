<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<!-- <script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "Board_list",
				success : function(x) {
					$("#result").html(x);
				},
				error : function() {
					alert('computer요청 실패!')
				}//error
			})//ajax
		})//b1
	})//$
</script> -->
<style>
html, body {
	height: 100%;
	background: #ffffff;
}

#container {
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-items: center;
	height: 100%;
}

#loginBox {
	width: 300px;
	text-align: center;
	background-color: #ffffff;
}

.input-form-box {
	border: 0px solid #ff0000;
	display: flex;
	margin-bottom: 10px;
}

.input-form-box>span {
	display: block;
	text-align: left;
	padding-top: 5px;
	min-width: 65px;
}

.button-login-box {
	margin: 10px 0;
}

#loginBoxTitle {
	color: #198754;
	font-weight: bold;
	font-size: 42px;
	text-transform: uppercase;
	padding: 5px;
	margin-bottom: 20px;
	background: linear-gradient(to right, #198754, #8ca6ce);
	-webkit-background-clip: text;
	-webkit-text-fill-color: transparent;
}

#inputBox {
	margin: 10px;
}

#inputBox button {
	padding: 3px 5px;
}
</style>
</head>
<body class="text-center">
	<div id="container">
		<div id="loginBox">

			<div id="loginBoxTitle">맛.Zip로그인</div>

			<div id="inputBox">
				<form action="owner_login" method="get">
					<div class="input-form-box">
						<input name="id" placeholder="아이디"
							style="width: 100%; height: 50px;">
					</div>

					<div class="input-form-box">
						<input name="pw" placeholder="비밀번호"
							style="width: 100%; height: 50px;">
					</div>

					<div class="button-login-box">
						<button type="submit" class="btn btn-success"
							style="width: 100%; height: 50px;" id="b1">로그인</button>
					</div>
				</form>
			</div>
			<hr color="green">

			<%-- <hr color ="green">
	<h1 style= "color:green;">${id}님이 로그인 중입니다 ~!</h1>
	
	<a href="board2.jsp">
	<button style="background: grey ">게시판 화면으로 go</button>
	</a> --%>
		</div>
	</div>

</body>
</html>