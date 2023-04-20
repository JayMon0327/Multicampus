package com.multi.mvc901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 
@Component
public class BBSDAO {
	
	@Autowired
	SqlSessionTemplate my;
	

	public int insert(BbsVO bag) {
		int result = my.insert("bbs.create", bag);
		return result;
	}
	public int update(BbsVO bag) {
		int result = my.update("bbs.up", bag);
		return result;
	}
	
	public int delete(String no) {
		int result = my.update("bbs.del", no);
		return result;
		
	}
	public BbsVO one(int no) {
		BbsVO bag = my.selectOne("bbs.one", no);
		return bag;
	}// one
//
//
//	
//	public ArrayList<BbsVO> list() {
//		
//		return list;
//
//	}
}
