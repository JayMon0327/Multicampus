<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/out.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "jsonResponse1",
				dataType : "json",
				success : function(json) {
					alert(json)
					$('#d2').empty()
					$('#d1').empty()
					$('#d1').append(json.id + "<br>" + 
								json.name + " " + 
								json.url + " " + 
								json.img)
				} //success
			})//ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({
				url : "jsonResponse2",
				dataType : "json",
				success : function(array) {
					$('#d2').empty()
					$('#d1').empty()
					//alert(array)
					//alert(array[0].id)
					for(i = 0; i < array.length; i++){
						console.log(array[i].id + " "+ array[i].img)
						$('#d1').append(
								"아이디: " + array[i].id + 
								" 북마크이름: " + array[i].name + 
								" url: <a href=" + array[i].url + ">GO URL</a>" +
								" img: <img src=" + array[i].img + " width=100 height=100><br>" 
						)//d1
					}//for
				} //success
			})//ajax
		}) //b2
		$('#b3').click(function() {
			$.ajax({
				url : "jsonResponse2",
				dataType : "json",
				success : function(array) {
					//alert(array)
					//alert(array[0].id)
					$('#d2').empty()
					$('#d1').empty()
					$('#d2').append("<table border='1' class='table table-striped table-hover'><tr><td>아이디</td><td>북마크이름</td><td>url</td><td>img</td></tr>")
					for(i = 0; i < 5; i++){
						console.log(array[i].id + " "+ array[i].img)
						$('#d2').append(
								"<tr class='table table-striped table-hover''>" +
								"<td>" + array[i].id + 
								"</td><td>" + array[i].name + 
								"</td><td><a href=" + array[i].url + ">GO URL</a>" +
								"</td><td>img: <img src=" + array[i].img + " width=100 height=100>" +
								"</td></tr>"
						)//d2
					}//for
					$("#d2").append("</table>")
				} //success
			})//ajax
		}) //b3
	}) //$
</script>
</head>
<body>
<button id="b1">우리도 JSON 받아보자!</button>
<button id="b2">우리도 JSON 많이 받아보자!(리스트로)</button>
<button id="b3">우리도 JSON 많이 받아보자!(테이블로)</button>
<hr>
<div id="d2"></div>
<div id="d1"></div>
</body>
</html>




