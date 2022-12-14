<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 style=color:red>게시판 검색입니다.</h3>
<a href="one.do?no=1">1번 게시물 검색</a><br>
<a href="one.do?no=2">2번 게시물 검색</a><br>
<a href="one.do?no=3">3번 게시물 검색</a><br>
<hr color="red">
<!--태그 사이에 내용(contents)이 비어있음. 빈태그  -->
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password="1234"
	scope="application"
	var="db"
/>

<sql:query var="list" dataSource="${db}">
	select * from reply
</sql:query>
<c:forEach items="${list.rows}" var="vo">
- content: ${vo.content}, no: ${vo.no}<br>
</c:forEach>
<sql:update dataSource="${db}">
insert into bbs values (null, 'sql', 'sql', 'apple')
</sql:update>









</body>
</html>