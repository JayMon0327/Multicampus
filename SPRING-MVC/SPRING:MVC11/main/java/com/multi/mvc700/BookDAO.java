package com.multi.mvc700;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Locale;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 

@Component
public class BookDAO {

	@Autowired
	SqlSessionTemplate my;

	public int insert(BookVO bag) {
		
		int result	= my.insert("book.create", bag);
		return result;
	}
	public int update(BookVO bag) {
		int result	= my.update("book.up", bag);
		return result;
	}

	public int delete(int id) {
		int result	= my.delete("book.del", id);
		return result;

	}
	public BookVO select(int id) {
		BookVO bag = my.selectOne("book.select", id);
		return bag;
	}// one

	
	public List<BookVO> list() {
		List<BookVO> list = my.selectList("book.all");
		return list;
	}
}
