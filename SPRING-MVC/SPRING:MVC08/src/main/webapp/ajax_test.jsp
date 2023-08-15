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
		//시작하자마자 $.ajax() 호출하면 됨. 
		$.ajax({
			url : "list5",
			success : function(x) {
				$('#result').append(x)
			} //success
		}) //ajax
		
		$('#b1').click(function() {
			//기존의 것 삭제됨.
			$('#result').empty()
			$.ajax({
				url : "list5",
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b1
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
		})//b2
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url : "list6",
				data : {
					bbsno : 30
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b3
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one5",
				data : {
					id : "apple"
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b4
		$('#b5').click(function() {
			$('#result').empty()
			$.ajax({
				url : "one6",
				data : {
					no : 1
				},
				success : function(x) {
					$('#result').append(x)
				} //success
			}) //ajax
		})//b5
		$('#b7').click(function() {
			$('#result').empty()
			$.ajax({
				url : "update2.multi",
				data : {
					no : $('#no').val(),
					content : $('#content').val()
				},
				success : function() {
					$('#result').append("수정완료");
				} //success
			}) //ajax
		})//b7
		$('#b8').click(function() {
			$('#result').empty()
			$.ajax({
				url : "delete2.multi",
				data : {
					no : $('#no2').val()
				},
				success : function(x) {
					location.href="ajax_test.jsp"
				} //success
			}) //ajax
		})//b8
		
	})//$
</script>
</head>
<body>
<button id="b1">bbs리스트 가지고 오기</button>
<button id="b2">bbs번호 1번 reply리스트 가지고 오기</button>
<button id="b3">bbs번호 30번 reply리스트 가지고 오기</button> <!-- list6, bbsno: 30 -->
<button id="b4">member id가 apple인사람의 정보 가지고 오기</button> 
<!-- one5, id: apple, views/one5.jsp -->
<button id="b5">bbs no가 1인 게시물의 상세 정보 가지고 오기</button> 
<!-- one6, no: 1, views/one6.jsp -->
<button id="b6">member의 모든 리스트 가지고 오기</button> 
<!-- list7, views/list7.jsp -->

<hr color="blue">
수정할 번호: <input id="no"><br>
수정할 내용: <input id="content"><br>
<button id="b7">수정하기 </button> 

<hr color="blue">
삭제할 번호: <input id="no2"><br>
<button id="b8">삭제하기 </button>
 
<hr color="red">
<div id="result" style="background: yellow"></div>
</body>
</html>










