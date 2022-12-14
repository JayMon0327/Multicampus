package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bbs3DAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public List<Bbs3VO> list() {
		return my.selectList("bbs3.list");
	}
	public List<Bbs3VO> list2(PageVO vo) {
		return my.selectList("bbs3.list2", vo);
	}
	public List<Bbs3VO> all(PageVO vo) {
		return my.selectList("bbs3.all", vo);
	}
	public int count() {
		return my.selectOne("bbs3.count");
	}
	
}
