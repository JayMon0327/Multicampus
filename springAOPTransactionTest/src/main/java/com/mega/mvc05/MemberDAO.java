package com.mega.mvc05;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mybatis;

	
	public int insert(MemberVO vo) {
		return mybatis.insert("member.create", vo);
	}
	
	public String sLogin(MemberVO vo) {
		String getPw = mybatis.selectOne("member.one", vo);
		System.out.println("1: " + getPw);
		if(getPw != null) {
			return getPw;
		}
		return "null";
	}
}
