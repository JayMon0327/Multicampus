<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script type="text/javascript">
	google.charts.load('current', {
		'packages' : [ 'corechart' ]
	});
	
	var pizza = 0
	var bulgogi = 0
	var kimchisoup = 0
	var etc = 0
	google.charts.setOnLoadCallback(drawChart);
	
	function drawChart(){
		$.ajax({
			url : "jsonResponse54",
			data :{
				pizza,
				bulgogi,
				kimchisoup,
				etc
			},
			dataType : "json",
			success : function(json) {

				pizza = json.pizza
				bulgogi = json.bulgogi
				kimchisoup = json.kimchisoup
				etc = json.etc
				
				var data = new google.visualization.DataTable();
				data.addColumn('string', 'Menu');
				data.addColumn('number', 'Populartiy');

				data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
						[ 'kimchi_soup', kimchisoup], [ 'etc',  etc]// Below limit.
				]);

				var options = {
					title : '점심 뭐먹을지 투표',
					sliceVisibilityThreshold : .2
				};

				var chart = new google.visualization.PieChart(document
						.getElementById('chart_div'));
				chart.draw(data, options);
			} //success
		})//ajax		
	}
	
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "jsonResponse55",
				data :{
					pizza,
					bulgogi,
					kimchisoup,
					etc
				},
				success : function(json) {
					pizza = json.pizza
					bulgogi = json.bulgogi
					kimchisoup = json.kimchisoup
					etc = json.etc
					
					var data = new google.visualization.DataTable();
					data.addColumn('string', 'Menu');
					data.addColumn('number', 'Populartiy');

					data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
							[ 'kimchi_soup', kimchisoup], [ 'etc',  etc]// Below limit.
					]);

					var options = {
						title : '점심 뭐먹을지 투표',
						sliceVisibilityThreshold : .2
					};

					var chart = new google.visualization.PieChart(document
							.getElementById('chart_div'));
					chart.draw(data, options);
				} //success
			})//ajax
		}) //b1
		
		$('#b2').click(function() {
			$.ajax({
				url : "jsonResponse56",
				data :{
					pizza,
					bulgogi,
					kimchisoup,
					etc
				},
				success : function(json) {

					pizza = json.pizza
					bulgogi = json.bulgogi
					kimchisoup = json.kimchisoup
					etc = json.etc
					
					var data = new google.visualization.DataTable();
					data.addColumn('string', 'Menu');
					data.addColumn('number', 'Populartiy');
					data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
							[ 'kimchi_soup', kimchisoup], [ 'etc',  etc]// Below limit.
					]);

					var options = {
						title : '점심 뭐먹을지 투표',
						sliceVisibilityThreshold : .2
					};

					var chart = new google.visualization.PieChart(document
							.getElementById('chart_div'));
					chart.draw(data, options);
				} //success
			})//ajax
		}) //b2
		
		$('#b3').click(function() {
			$.ajax({
				url : "jsonResponse57",
				data :{
					pizza,
					bulgogi,
					kimchisoup,
					etc
				},
				success : function(json) {

					pizza = json.pizza
					bulgogi = json.bulgogi
					kimchisoup = json.kimchisoup
					etc = json.etc
					
					var data = new google.visualization.DataTable();
					data.addColumn('string', 'Menu');
					data.addColumn('number', 'Populartiy');
					//data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
					//		[ 'kimchi_soup', kimchisoup], [ 'etc', etc ]// Below limit.
					//]);
					data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
							[ 'kimchi_soup', kimchisoup], [ 'etc',  etc]// Below limit.
					]);

					var options = {
						title : '점심 뭐먹을지 투표',
						sliceVisibilityThreshold : .2
					};

					var chart = new google.visualization.PieChart(document
							.getElementById('chart_div'));
					chart.draw(data, options);
				} //success
			})//ajax
		}) //b3
		
		$('#b4').click(function() {
			$.ajax({
				url : "jsonResponse58",
				data :{
					pizza,
					bulgogi,
					kimchisoup,
					etc
				},
				success : function(json) {
					
					pizza = json.pizza
					bulgogi = json.bulgogi
					kimchisoup = json.kimchisoup
					etc = json.etc
					
					var data = new google.visualization.DataTable();
					data.addColumn('string', 'Menu');
					data.addColumn('number', 'Populartiy');
					//data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
					//		[ 'kimchi_soup', kimchisoup], [ 'etc', etc ]// Below limit.
					//]);
					data.addRows([ [ 'pizza', pizza ], [ 'bulgogi', bulgogi ],
							[ 'kimchi_soup', kimchisoup], [ 'etc',  etc]// Below limit.
					]);

					var options = {
						title : '점심 뭐먹을지 투표',
						sliceVisibilityThreshold : .2
					};

					var chart = new google.visualization.PieChart(document
							.getElementById('chart_div'));
					chart.draw(data, options);
				} //success
			})//ajax
		}) //b4
	})
	
</script>
</head>
<body>
 <div id="chart_div" style="width: 900px; height: 500px;"></div>
 
<button id="b1">피자</button>
<button id="b2">불고기</button>
<button id="b3">김치찌개</button>
<button id="b4">아무거나</button>
</body>
</html>