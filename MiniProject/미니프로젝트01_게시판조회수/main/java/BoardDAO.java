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

//테이블 하나당 DAO 하나 ! -->CUD를 완성 !! 
@Component
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate my;
	

	public int insert(BoardVO bag) {
		int result = my.insert("board.create", bag);
		return result;
	}
	public int update(BoardVO bag) {
		int result = my.update("board.up", bag);
		return result;
	}
	
	public int delete(int board_id) {
		int result = my.update("board.del", board_id);
		return result;
		
	}
	
	public BoardVO one(int board_id) {
		BoardVO bag = my.selectOne("board.one", board_id);
		return bag;
	}// one

	public List<BoardVO> list() {
		List<BoardVO> list = my.selectList("board.list");
		System.out.println(list.size());
		return list;

	} //list
	public int view(int board_id) {
		int result = my.update("board.view",board_id);
		return result;
	}
	public int like(int board_id) {
		int result = my.update("board.like",board_id);
		return result;
	}
	
}
