<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: yellow;
}
</style>
</head>
<body>
<!--  표현식(expression) --> 
회원검색 처리 요청이 완료되었습니다.<br>
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->
${bag.id} <br><!-- 출력용(expression language-EL)  -->
${bag.pw} <br>
${bag.name} <br>
${bag.tel} <br>
</body>
</html>




