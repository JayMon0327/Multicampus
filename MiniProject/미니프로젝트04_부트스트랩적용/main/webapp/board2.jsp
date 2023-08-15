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
<style>
@import
	url('https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap')
	;

body {
	font-family: 'IBM Plex Sans KR', sans-serif;
}

td {
	width: 200px;
	text-align: center;
}

.top0 {
	background: gray;
	color: green;
}

.down {
	background: green;
	color: white;
}

.id {
	text-align: center;
	position: absolute;
	right: 100px;
	top: 50px;
}

.id2 {
	text-align: center;
	position: absolute;
	right: 100px;
	top: 90px;
}

#search {
	position: relative;
	left: 430px;
	bottom: 25px;
}

#main {
	position: relative;
	left: 300px;
}

#main2 {
	position: relative;
	left: 300px;
	bottom: 30px;
}
</style>
<meta charset="UTF-8">
<title>맛.zip</title>
</head>
<body>

	<h1 style="color: green;" id="main">
		<button class="btn btn-outline-success"
			style="width: 100px; border-bottom: 2px solid green;">
			<em>맛.zip</em>
		</button>
	</h1>
	<form action="Board_one" method="get" id="search">
		<input name="board_id" type="text" size="40" placeholder="내용을 입력해주세요">
		<button type="submit" class="btn btn-success">
			검색<i class="bi bi-search"></i>
		</button>
	</form>
	<h3 style="color: gray;" id="main2">
		<em><span style="border-bottom: 2px solid gray;">사장님</span></em>
	</h3>
	<div class="container">
		<!--컨테이너  -->
		<div class="row">
			<%
				if (session.getAttribute("id") != null) {
			%>
			<h3 style="color: green;">
				<em class="id"><span class="badge text-bg-warning">${id}님</span></em>
			</h3>

			<%
				} else {
			%>
			<a href="owner_member.jsp"> <span class="id2"><button
						class="btn btn-warning">회원가입</button></span>
			</a><a href="owner_login.jsp"> <span class="id"><button
						class="btn btn-success">로그인</button></span>
			</a>
			<%
				}
			%>
		</div>
	</div>

	<div class="container">
		<!--컨테이너  -->
		<div class="row">
			<!-- 로우설정  -->
			<table class="table"
				style="text-align: center; border: 1px solid #dddddd">
				<tr class="table-success">
					<div class="col-md-3">
						<!-- 12개의 컬럼중에 3개씩 할당 -->
						<td><a href="owner_login">
								<button style="background-color: #fafafa;">
									<h4>매출,마진계산기</h4>
								</button>
						</a></td>
					</div>
					<div class="col-md-3">
						<td><a href="owner_login">
								<button style="background-color: #fafafa;">
									<h4>맛 News</h4>
								</button>
						</a></td>
					</div>
					<div class="col-md-3">
						<td><a href="Board_list">
								<button style="background-color: #fafafa;">
									<h4>자유게시판</h4>
								</button>
						</a></td>
					</div>
					<div class="col-md-3">
						<td><a href="owner_login">
								<button style="background-color: #fafafa;">
									<h4>전문가QnA</h4>
								</button>
						</a></td>
					</div>
				</tr>
			</table>
		</div>
	</div>
	<div class="container">
		<!--컨테이너  -->
		<div class="row">
			<!-- 로우설정  -->
			<table>
				<tr>
					<td class="down">추천게시물</td>
					<td class="top"></td>
					<td class="top"></td>
					<td class="top"></td>
					<td class="top"></td>
					<td class="top"></td>
				</tr>
			</table>
		</div>
	</div>
	<div class="container">
		<!--컨테이너  -->
		<div class="row">
			<!-- 로우설정  -->
			<table class="table" style="border: 1px solid #dddddd">
				<tr>
					<div class="col-md-2">
						<td>1</td>
					</div>
					<div class="col-md-4">
						<td>[매출]4월매출어떤가요?</td>
					</div>
					<div class="col-md-2">
						<td>사장이될고야1233</td>
					</div>
					<div class="col-md-1">
						<td>like16</td>
					</div>
					<div class="col-md-1">
						<td>댓글10</td>
					</div>
					<div class="col-md-2">
						<td>2023.04.19</td>
					</div>
				</tr>
				<tr>
					<div class="col-md-2">
						<td>2</td>
					</div>
					<div class="col-md-4">
						<td>[일상]등산객진상들 진짜 어쩌죠?</td>
					</div>
					<div class="col-md-2">
						<td>내 꿈은 미슐랭3스타</td>
					</div>
					<div class="col-md-1">
						<td>like12</td>
					</div>
					<div class="col-md-2">
						<td>댓글11</td>
					</div>
					<div class="col-md-2">
						<td>2023.04.18</td>
					</div>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>