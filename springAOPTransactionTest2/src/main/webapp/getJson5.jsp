<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "json3.do",
		dataType: "json",
		success: function(result) {
			console.log(result)
			$('#d1').append(result)
		
		}
	})
})
</script>
</head>
<body>
<h3>json으로 받아온 값</h3>
<hr color="red">
<div id="d1"></div>





</body>
</html>