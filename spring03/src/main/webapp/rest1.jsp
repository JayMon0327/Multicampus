<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "json.jsp",
				dataType : "json",
				success : function(json) {
					alert(json['id'] + " " + json.pw + " "  + json.name)
				} //success
			})//ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({
				url : "json2.jsp",
				dataType : "json",
				success : function(array) {
					alert(array)
					alert(array[0].id + " " + array[0].pw + " " + array[0].name)
					alert(array[1].id + " " + array[1].pw + " " + array[1].name)
				} //success
			})//ajax
		}) //b1
	}) //$
</script>
</head>
<body>
<button id="b1">우리도 JSON받아보자!</button>
<button id="b2">우리도 JSON 많이 받아보자!</button>
</body>
</html>