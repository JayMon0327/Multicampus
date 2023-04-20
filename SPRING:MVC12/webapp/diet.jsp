<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: white;
}
.memu{
	background: white; 
	color:purple;
}
.top{
	background: blue;
	color: white;
}
.down{
	background: pink;
}
#list{
background: white;
color: orange;
}
</style>
</head>
<body>
	<h3 class="memu">다이어트 식단 등록</h3>
	<hr color = "red">
	<form action="dietInsert" method="get">
	no:<input class="down" name ="no" value="20" ><br>
	morning:<input class="down" name ="morning" value="egg" ><br>
	lunch:<input class="down" name ="lunch" value="lamen"><br>
	dinner:<input class="down" name ="dinner" value="meat"><br>
	img:<input class="down" name ="img" value="food1.png"><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">식단 수정</h3>
	<hr color = "red">
	<form action="dietupdate" method="get">
	no:<input class="down" name ="no" value="9" ><br>
	lunch:<input class="down" name ="lunch" value="ham"><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">식단 삭제</h3>
	<hr color = "red">
	<form action="dietdelete" method="get">
	no:<input class="down" name ="no" value="9" ><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">식단 검색</h3>
	<a href="dietlist" id="list">모든 식단 리스트 가지고 오기</a>
	<form action="dietone" method="get">
	no:<input class="down" name ="no" value="6" ><br>
	<button class="top" type="submit">서버로전송</button><br>
	</form>
	
	<hr color = "red">

</body>
</html>
