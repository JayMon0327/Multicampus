<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	//{"id" : "root", "pw" : "1234", "name" : "홍길동", "tel" : "011"}
	//HashMap구조(키:값) --> put(키:값)
	JSONObject json = new JSONObject(); 
	json.put("id", "root");
	json.put("pw", "1234");
	json.put("name", "홍길동");
	json.put("tel", "011");
	
	//{"id" : "admin", "pw" : "5678", "name" : "김길동", "tel" : "099"}
	JSONObject json2 = new JSONObject(); 
	json2.put("id", "admin");
	json2.put("pw", "5678");
	json2.put("name", "김길동");
	json2.put("tel", "099");
	
	JSONArray array = new JSONArray(); //arraylist상속 받아 만들었음.(add())
	
	//index는 0번과 1번이 들어있음.
	//[
	//  {"id" : "root", "pw" : "1234", "name" : "홍길동", "tel" : "011"}, 
	//  {"id" : "admin", "pw" : "5678", "name" : "김길동", "tel" : "099"}
	//]
	array.add(json);
	array.add(json2);
	
	//PrintWriter out = new PrintWriter();
	out.print(array.toJSONString());
%>