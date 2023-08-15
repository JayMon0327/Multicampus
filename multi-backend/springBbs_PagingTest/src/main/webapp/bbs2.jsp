<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() {
		//alert('test...')
		$('#b1').click(function() {
			$.ajax({
				url : "bbsList", //views/bbsList.jsp가 결과!
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({
				url : "bbsList2", //views/bbsList2.jsp가 결과!
				data : {
					start : 1, 
					end : 5
				},
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		}) //b2
		
		$('#b3').click(function() {
			$.ajax({
				url : "bbsList2", //views/bbsList2.jsp가 결과!
				data : {
					start : 6, 
					end : 10
				},
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		}) //b3
		
		$('#b4').click(function() {
			$.ajax({
				url : "bbsList2", //views/bbsList2.jsp가 결과!
				data : {
					page : 1
				},
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		}) //b4
		
		$('#b5').click(function() {
			$.ajax({
				url : "bbsList2", //views/bbsList2.jsp가 결과!
				data : {
					page : 2
				},
				success : function(result) { //결과가 담겨진 table부분코드
					$('#d1').html(result)
				},
				error : function() {
					alert('실패.@@@')
				}
			}) //ajax
		}) //b5
		
	})
</script>
<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
	<button id="b1">게시물 목록(bbsno: 10-15)</button>
	<button id="b2">게시물 목록(page1>> bbsno: 1-5)</button>
	<button id="b3">게시물 목록(page2>> bbsno: 6-10)</button>
	<button id="b4">게시물 목록(page1>>)</button>
	<button id="b5">게시물 목록(page2>>)</button>
	<hr color="red">
	<div id="d1" style="background: yellow"></div>
</body>
</html>