<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body bgcolor="lime" >
<br>
<center>
<button type="button" class="btn btn-primary">머신러닝 추천시스템</button>
</center>
<hr color="red">
<form action="ml">
<table class="table table-striped">
    <thead>
     <tr>
        <td>item</td>
        <td>value</td>
      </tr>
    </thead>
    <tbody>
     <tr>
        <td>sexFemale(0,1)</td>
        <td> 
        	<input class="form-control"  name="sexFemale" value="0">
        </td>
      </tr>
      <tr>
        <td>age</td>
        <td> 
        	<input class="form-control"  name="age" value="20">
        </td>
      </tr>
      <tr>
        <td>sibsp</td>
         <td> 
        	<input class="form-control"  name="sibsp" value="2">
        </td>
      </tr>
      <tr>
        <td>fare</td>
         <td> 
        	<input class="form-control"  name="fare" value="2">
        </td>
      </tr>
      <tr>
        <td>classThird(0,1)</td>
        <td> 
        	<input class="form-control"  name="classFirst" value="1">
        </td>
      </tr>
      <tr>
        <td>classFirst(0,1)</td>
         <td> 
        	<input class="form-control"  name="classSecond" value="0">
        </td>
      </tr>
      <tr>
        <td>classSecond(0,1)</td>
         <td> 
        	<input class="form-control"  name="classThird" value="0">
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
        	<button type="submit" class="btn btn-danger">머신러닝 타이타닉 생사예측 프로그램 실행</button>
        </td>
      </tr>
    </tbody>
  </table>
</form>
</body>
</html>