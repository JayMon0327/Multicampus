<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').ready(function() {
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		}) //b1
		/* $('#b1').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		}) //b1 */

		$('#b2').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		}) //b2
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 5
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		}) //b3

		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one",
				data : {
					id : "apple"
				},
				success : function(s) {
					$('#result').append(s)
				} //success
			}) //ajax
		}) //b4
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list",
				success : function(s) {
					$('#result').append(s)
				} //success
			}) //ajax
		}) //b5
		$('#b6').click(function() {
			$('#result').empty()
			$.ajax({
				url : "Bbsone",
				data : {
					no : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		}) //b6

		$('#bbsde').click(function() {
			$('#result').empty()
			$.ajax({
				url : "delete2",
				data : {
					no : $('#no2').val()

				},
				success : function(x) {
					$('#result').append(x)
					alert("삭제완료")
					document.location.reload();
				} //success
			}) //ajax
		}) //de
		$('#bbsup').click(function() {
			$('#result').empty()
			$.ajax({
				url : "update2",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function(x) {
					$('#result').append(x)
					alert("수정완료")
					document.location.reload();
				} //success
			}) //ajax
		}) //up
		$('#b7').click(function() {
			$('#result').empty()
			$.ajax({
				url:'weather',
				success: function(x){
					$('#result').append(x)
				}
				
			})
		}) //b1
		
	}) //$
</script>
</head>
<body>
	<button id="b1">bbs리스트 가지고 오기</button>
	<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
	<button id="b3">bbs번호 5번 reply리스트 가지고 오기</button>
	<button id="b4">member id가 apple인 사람 정보 가지고 오기</button>
	<button id="b5">member 전체정보 가지고 오기</button>
	<button id="b6">bbs 1번리스트 가지고 오기</button>
	<button id="b7">날씨 정보 받아오기</button>
	
	<br> 수정할no:
	<input id="no" width="200">
	<br>수정할content:
	<input id="content" style="width: 200">
	<button id="bbsup" style="background: pink">수정</button>
	<br> 삭제할no:
	<input id="no2">
	<button id="bbsde" style="background: pink">삭제</button>

	<hr color="red">
	<div id="result" style="background: pink"></div>
</body>
</html>