<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script>
	//이 페이지가 호출되었을때 memo_list()가 맨처음 실행
	$(function() {
		memo_list();

		//메모를 쓰고 난다음 확인버튼을 누르면 밑에있는 코드에 id값 :btnWrite가 이 태그로 맵핑되고, memo_insert()함수가 실행된다.
		$("#btnWrite").click(function() {
			memo_insert();
		});
	});

	function memo_insert() {
		var writer = $("#writer").val(); // 메모를 작성한 작성자의 이름이 writer변수에 담긴다.
		var memo = $("#memo").val(); // 작성한 메모가 memo변수에 저장된다.
		alert(writer + " " + memo)

		$.ajax({ //ajax방식은 페이지가 바뀌지 않고 데이터만 주고 받을 수 있는 방식
			type : "post", //post방식으로 넘김
			data : {
				"writer" : writer,
				"memo" : memo
			},//각각 값들을 저장함
			url : "memo_insert.do", //memo_insert.do (컨트롤러로) 맵핑됨

			success : function() { //위의 구문이 성공했을시에 실행되는 함수
				memo_list(); //목록 갱신
				$("#writer").val(""); //writer에 value값에 ""(공백) 값을 넣는다.
				$("#memo").val(""); //memo에 value값에 ""(공백) 값을 넣는다.
			}
		});
	}
	function memo_list() {

		$.ajax({
			url : "memo_list.do",
			success : function(result) { 
				$("#memoList").html(result);
			}
		});
	}
	function memo_view(num) {
		// memo_view.do?_id=5
		location.href = "memo_view.do?_id=" + num;
	}
</script>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<h2 style="background: orange; color: red; width: 800px; height: 50px;">멀티 메모장!! 자유롭게 아무말이나~~!!</h2>

	이름 :
	<input id="writer" value="win"> 메모 :
	<input id="memo" size="50" value="win">
	<input type="button" value="확인" id="btnWrite">
	<div id="memoList" style="background: yellow; width:800px; height: 300px;"></div>
</body>
</html>
