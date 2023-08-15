<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
@import url('https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap');
body{
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

.top {
	background: white;
	color: black;
}

.down {
	background: green;
	color: white;
}

#id {
	text-align: center;
	position: absolute;
	right: 10px;
	top: 10px;
}

#search {
	position: absolute;
	right: 500px;
	top: 30px;
}

.main {
	position: relative;
	left: 430px;
}
</style>
<meta charset="UTF-8">
<title>맛.zip</title>
</head>
<body >
	<h1 style="color: green;" class="main">
		<em><span style="border-bottom: 2px solid green;">맛.zip</span></em>
	</h1>
	<form action="Board_one" method="get" id="search">
		<input name="board_id" value="2">
		<button type="submit">검색</button>
	</form>
	<h3 style="color: gray;" class="main">
		<em><span style="border-bottom: 2px solid gray;">사장님</span></em>
	</h3>
	<%
		if (session.getAttribute("id") != null) {
	%>
	<h3 style="color: green;">
		<em id="id">${id}님</em>
	</h3>
	<%
		} else {
	%><a href="owner_login.jsp">
		<button style="background: green;">로그인</button>
	</a>
	<a href="owner_member.jsp">
		<button style="background: pink;">회원가입화면으로go</button>
	</a>
	<%
		}
	%>


	<hr color="green">
	<table>
		<tr>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>매출,마진계산기</h4>
					</button>
			</a></td>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>맛 News</h4>
					</button>
			</a></td>
			<td class="top0"><a href="Board_list">
					<button style="background: gray;">
						<h4>자유게시판</h4>
					</button>
			</a></td>
			<td class="top0"><a href="owner_login">
					<button style="background: gray;">
						<h4>전문가QnA</h4>
					</button>
			</a></td>
			<td class="top0"><h4></h4></td>
			<td class="top0"><h4></h4></td>
		</tr>
	</table>

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
	<hr color="green">
	<table>
		<tr>
			<td class="top">1</td>
			<td class="top">[매출]4월매출어떤가요?</td>
			<td class="top">사장이될고야1233</td>
			<td class="top">like16</td>
			<td class="top">댓글10</td>
			<td class="top">2023.04.19</td>
		</tr>
		<tr>
			<td class="top">2</td>
			<td class="top">[일상]등산객진상들 진짜 어쩌죠?</td>
			<td class="top">내꿈은미슐랭3스타</td>
			<td class="top">like12</td>
			<td class="top">댓글11</td>
			<td class="top">2023.04.18</td>

		</tr>


	</table>

</body>
</html>