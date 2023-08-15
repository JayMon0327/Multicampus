package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	public int insert(BbsVO2 vo) throws Exception {
		int result = 0;
		result = mybatis.insert("bbs.create", vo);
		return result; 
	}

	public BbsVO2 select(BbsVO2 vo) {
		BbsVO2 vo2 = mybatis.selectOne("bbs.one", vo);
		System.out.println("검색 결과: " + vo2);
		return vo2;
	}

	public List<BbsVO2> list() {
		List<BbsVO2> list = mybatis.selectList("bbs.list");
		return list;
	}
	
	public void delete(BbsVO2 vo) {
		mybatis.delete("bbs.delete", vo);
	}

	public void update(BbsVO2 vo) {
		mybatis.update("bbs.update", vo);
	}



}
