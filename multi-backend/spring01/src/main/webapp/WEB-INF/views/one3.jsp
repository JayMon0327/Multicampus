<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- dto이 전달되어있는 상태 -->
<!-- model의 속성을 출력할 때는 EL을 쓴다.!! -->
<!-- expression(표현식, 출력) language(EL) -->
검색한 id >> ${dto.id} <br>
검색한 name >> ${dto.name} <br> <!-- dto.getName() -->
검색한 url >> ${dto.url} <br>
검색한 img >> <img alt="" src="resources/img/${dto.img}"> 
 <br>
</body>
</html>