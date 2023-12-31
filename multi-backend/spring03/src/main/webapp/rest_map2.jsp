<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>마커 생성하기</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function() { //DOM Tree를 메모리에 읽자마자, 오른쪽에 있는 익명함수를 실행해주세요.!!
		//ajax 통신을 통해서, json을 받아오자!!!
		$.ajax({
				url : "jsonResponse5",
				dataType : "json",
				success : function(array) {
					//alert(json.name + " " + json.lat + " " + json.lng)
					for(i = 0; array.length; i++){
						name = array[i].name
						lat = array[i].lat
						lng = array[i].lng
					
					var mapContainer = document.getElementById('map'+i), // 지도를 표시할 div 
					
					mapOption = {
						center : new kakao.maps.LatLng(lat, lng), // 지도의 중심좌표
						level : 3
					// 지도의 확대 레벨
					};

					var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

					// 마커가 표시될 위치입니다 
					var markerPosition = new kakao.maps.LatLng(lat, lng);

					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						position : markerPosition
					});

					// 마커가 지도 위에 표시되도록 설정합니다
					marker.setMap(map);

					// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
					// marker.setMap(null);
					}
				} //success
			})//ajax
	})
</script>
</head>
<body>
	<div id="map1" style="width: 500px; height: 350px;"></div>
	<div id="map2" style="width: 500px; height: 350px;"></div>

	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=24d6175a78af577c88e5cb22936f9ff6"></script>
	
	
	<script>
		/* alert(lat, lng)
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		
		mapOption = {
			center : new kakao.maps.LatLng(lat, lng), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 마커가 표시될 위치입니다 
		var markerPosition = new kakao.maps.LatLng(lat, lng);

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
			position : markerPosition
		});

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);

		// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
		// marker.setMap(null); */
	</script>
</body>
</html>