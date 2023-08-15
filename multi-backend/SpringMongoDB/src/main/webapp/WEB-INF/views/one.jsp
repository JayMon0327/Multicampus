<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="../../header.jsp" %>
</head>
<body>
<h2>메모장</h2>
<form action="update.memo">
	번호 : <input type="text" name="_id" value="${vo._id}" readonly="readonly" > <br>
	이름 : <input name="name" size="30" value="${vo.name}" readonly="readonly"> <br>
	내용 : <input name="content" size="30" value="${vo.content}" class="td1"><br>
	날씨 : <input name="weather" size="30" value="${vo.weather}" readonly="readonly"> <br>
	날짜 : <input name="date" size="30" value="${vo.date}" readonly="readonly"> <br>
	<button>메모 수정</button>
</form>
<hr color="red">
<a href="delete.memo?_id=${vo._id}">
	<button>메모 삭제</button>
</a>
<a href="mongo_memo.jsp">
	<button>메모 목록</button>
</a>

</body>
</html>
