<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td {
	width: 200px;
	text-align: center;
}

.top0 {
	background: gray;
	color: green;
}

.top {
	background: white;
	color: black;
}

.down {
	
}

#id {
	text-align: center;
}

#b1 {
	background: gray;
}
</style>
</head>
<body>
<div id="result">
		<h4>
			<b>댓글</b>
		</h4>
		<table>
			<c:forEach items="${Com_list}" var="bag">
				<tr>
					<td class="down"><em><span
							style="border-bottom: 2px solid green;">${bag.writer}</span></em><br>
					<br>${bag.content}<br>${bag.regdate}<hr></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>