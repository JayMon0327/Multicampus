<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table">
	<tr>
		<td>bbs_no</td>
		<td>번호</td>
		<td>제목</td>
		<td>내용</td>
		<td>작성자</td>
	</tr>
	<c:forEach items="${list}" var="one">
	<tr>
		<td>${one.bbs_no}</td>
		<td>${one.id}</td>
		<td>${one.title}</td>
		<td>${one.content}</td>
		<td>${one.writer}</td>
	</tr>
	</c:forEach>
</table>
