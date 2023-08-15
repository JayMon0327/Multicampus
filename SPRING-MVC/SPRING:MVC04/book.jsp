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
	<h3 class="memu">북마크등록</h3>
	<hr color = "red">
	<form action="bookInsert" method="get">
	name:<input class="down" name ="name" value="shoes" ><br>
	url:<input class="down" name ="url" value="www.shoes.com"><br>
	img:<input class="down" name ="img" value="shoes.png"><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">북마크수정</h3>
	<hr color = "red">
	<form action="bookupdate" method="get">
	name:<input class="down" name ="name" value="shoes"><br>
	url:<input class="down" name ="url" value="www.shoes1.com"><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">북마크삭제</h3>
	<hr color = "red">
	<form action="bookdelete" method="get">
	name:<input class="down" name ="name" value="shoes"><br>
	<button class="top" type="submit">서버로전송</button>
	</form>
	
	<h3 class="memu">북마크검색</h3>
	<a href="booklist" id="list">모든 게시판 리스트 가지고 오기</a>
	<hr color = "red">
	<form action="bookselect" method="get">
	ID:<input class="down" name ="id" value="google"><br>

	<button class="top" type="submit">서버로전송</button>
	</form>
</body>
</html>
