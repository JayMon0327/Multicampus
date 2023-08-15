<%@page import="multi.movieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BBSDAO"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- jsp에만 있는 문법 -->
 <jsp:useBean id="bag" class="multi.movieVO"></jsp:useBean> <!-- bag만들 -->
 <jsp:setProperty property="*" name="bag"/> <!-- property는 변수라는뜻 / 입력한정보 + 가방에등록까지  -->
    <%
    /* //0.클라이언트가 입력한 정보를 받아주세요 !!
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String content = request.getParameter("content");
    String price = request.getParameter("price");
    String company = request.getParameter("company");
    String img = request.getParameter("img");
	
    //1. 받은 데이터를 dao에게 주기 위해서 가방을 만들어서 넣자.
	ProductVO bag = new ProductVO();
    bag.setId(id);
    bag.setName(name);
    bag.setContent(content);
    bag.setPrice(Integer.parseInt(price));
    bag.setCompany(company);
    bag.setImg(img); */
    //2. dao에게 가방을 전달하면서 insert해달라고 하자. ! 
  	movieDAO dao = new movieDAO();
    dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화작성확인</title>
<style type="text/css">
body{
background: blue;
color: white; 
}
</style>
</head>
<body>
영화등록완료
<hr color = red>

<!-- img src = img/shoes1.jpg -->
그림: <img src="img/<%=bag.getContent() %>" width=200 height=200> 
</body>
</html>