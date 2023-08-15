<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

//jsp에서 자동import : 클릭하고, ctrl + shift + m 
Class.forName("oracle.jdbc.driver.OracleDriver");
// 특정한 위치에 있는 드라이버 파일을 램에 읽어들여 설정

// 2. db연결 mySQL: school, oracle: xe
String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";
Connection con = DriverManager.getConnection(url, user, password); // Connection

// 3. sql문을 만든다.
String sql = "select * from health";
PreparedStatement ps = con.prepareStatement(sql);

// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그램 알려줌.
ResultSet rs = ps.executeQuery();
String id = null, name = null, company = null;
if(rs.next()){
	id = rs.getString(1);
	name = rs.getString(2);
	company = rs.getString(3);
}


con.close();
ps.close();
%>
<table border="1">
	<tr>
		<td>아이디</td>
		<td>이름</td>
		<td>회사</td>
	</tr>
	<tr>
		<td><%= id %></td>
		<td><%= name %></td>
		<td><%= company %></td>
	</tr>
</table>





