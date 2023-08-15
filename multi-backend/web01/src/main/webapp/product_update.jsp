<%@ page import="db_connect.ProductVO"%>
<%@ page import="db_connect.ProductDAO"%>
<!-- @ : page 지시자(tomcat WAS에게!!)  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 
    	1. 입력
    	2. 처리(db처리 -dao, vo)
    	3. 출력(브라우저로 출력, html)
      -->
      <!-- 1. 데이터를 product_insert.html에서 입력해서 넘김 값을 받으면 될 것. -->
      <%
      //스크립트릿(scriptlet--> 자바코드를 쓰는 부분)
     //HttpServletRequest request = new HttpServletRequest();//내장된 객체
     //주소부분 중에서 id=110
     String id = request.getParameter("id"); //"110"
     String content = request.getParameter("content");
     
     ProductVO bag = new ProductVO();
     bag.setID(id);
     bag.setCONTENT(content);
     
     ProductDAO dao = new ProductDAO();
     dao.update(bag);
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품 수정 정보 확인</h3>
<%= bag %> <!-- 표현식(expression)-->
<hr>
id : <%= id %> <br>
content : <%= content %> <br>
<hr>
<a href="product_insert.html">
	<button>상품등록페이지로</button>
</a> | 
<a href="product.html">
	<button>첫페이지로</button>
</a>
</body>
</html>






