package com.multi.mvc901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DietDAO { // CRUD
	@Autowired
	SqlSessionTemplate my;
	
	public int insert(DietVO bag) {// 가방을 받아서
		
		int result = my.insert("diet.create", bag);
		return result;
	}
	public int update(DietVO bag) {
		int result = my.update("diet.up", bag);
		return result;
	}
	
	public int delete(String no) {
		
		int result = my.delete("diet.del", no);
		
		return result;
		
	}
	public DietVO one(String no) {
		DietVO bag = my.selectOne("diet.one", no);
		
		return bag;
		
	}// one
	
	public List<DietVO> list() {
		List<DietVO> list = my.selectList("diet.all");
		return list;
	}
	
	
//	public ArrayList<MemberVO> list() {
//		MemberVO bag = new MemberVO();
//		
//		return list;
//
//	}



//	public int login(MemberVO bag) {
//		
//		return result;
//
//	}
}
