package com.multi.mvc300;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO6 { // CRUD
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(MemberVO bag) {// 가방을 받아서
		
		int result = my.insert("member.create", bag);
		return result;
	}
	public int update(MemberVO bag) {
		int result = my.update("member.up", bag);
		return result;
	}
	
	public int delete(String id) {
		
		int result = my.delete("member.del", id);
		
		return result;
		
	}
	
//	public ArrayList<MemberVO> list() {
//		
//		return list;
//
//	}
//
//
//	// public void add2() {
//
//	public int login(MemberVO bag) {
//		
//		return result;
//
//	}
//	public MemberVO one(String id) {
//		
//		return bag;
//	}// one
}
