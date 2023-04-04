<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta content='width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no' name='viewport'>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/cors.js"></script>
<script type="text/javascript">
	$(function() {
		$.ajax({
			crossOrigin: true,
			url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
			dataType : 'json',
			success: function(x){
				console.log(x);
				$('#result').html("위치"+x.name+"<br>"+
						"날씨"+x.weather[0].description+"<br>"+
						"풍속"+x.wind.speed+"<br>"+
						"최고 기온"+x.main.temp_max+"<br>"+
						"최저 기온"+x.main.temp_min+"<br>"+
						"체감 온도"+x.main.feels_like+"<br>"+
						"구름"+x.clouds.all+"<br>")
			}
			
		})
	})
</script>
</head>
<body>
<button id="b1">날씨 알아오기!</button>
<hr>
<div id="result"></div>
</body>
</html>