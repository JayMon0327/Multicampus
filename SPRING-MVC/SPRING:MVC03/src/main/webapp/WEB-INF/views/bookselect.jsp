<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background: yellow;
}
</style>
</head>
<body>
<h3>검색완료</h3> <br>
<hr color = "red">
검색한 name >> ${bag.name}<br>
검색한 url >> ${bag.url}<br>
<img src ="resources/img/${bag.img}" width=400 height=600>
</body>
</html>