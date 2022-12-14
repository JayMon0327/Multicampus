<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
<script>
$(function(){
    //수정버튼을 클릭하면 실행되는 함수, 밑에 코드에서 맵핑되어서
    //컨트롤러의 memo_update.do url로 맵핑시킨다.
    $("#btnUpdate").click(function(){ 
        document.form1.action="memo_update.do";
        document.form1.submit();
    });
    
    //삭제버튼을 클릭하면 실행되는 함수, 밑에 코드에서 맵핑되어서
    //컨트롤러에 memo_delete.do url로 맵핑시킨다.
    $("#btnDelete").click(function(){
        if(confirm("삭제하시겠습니까?")){
            document.form1.action="memo_delete.do";
            document.form1.submit();
        }
    });
});
</script>
</head>
<body>
<%@ include file="menu.jsp" %>
<h2>메모장</h2>
 
<form name="form1" method="post"> <!--키값이 id이기 때문에 _id를 dto에서 받아서 히든타입으로 자료를 넘겨준다. -->
<input type="hidden" name="_id" value="${dto._id}">
 
이름 <input name="writer" value="${dto.writer}"><br> <!-- dto에 저장된 작성자이름 출력 -->
메모 <input name="memo" value="${dto.memo}" size="50"><br><!-- dto에 저장된 메모 출력 -->
 
<input type="button" value="수정" id="btnUpdate"> <!-- 수정버튼을 누르면 id값이 위쪽에 있는 자바스크립트 함수에  맵핑되서 자바스크립트문에서 컨트롤러로 이동시킴-->
 
<input type="button" value="삭제" id="btnDelete"> <!-- 삭제버튼을 누르면 id값이 위쪽에 있는 자바스크립트 함수에  맵핑되서 자바스크립트문에서 컨트롤러로 이동시킴-->
 
<input type="button" value="목록" id="btnList" onclick="location.href='memo.do'">
<!-- 목록 버튼을 누르면 id값인 btnList가 컨트롤러로 맵핑됨 (memo.do URL로) -->
 
</form>
</body>
</html>
