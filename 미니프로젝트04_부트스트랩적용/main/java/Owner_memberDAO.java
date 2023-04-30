package com.multi.mvc200;

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
public class Owner_memberDAO { // CRUD
	@Autowired
	SqlSessionTemplate my;

	public int insert(Owner_memberVO bag) {

		int result = my.insert("owner.create", bag);
		return result;
	}

	public int update(Owner_memberVO bag) {
		int result = my.update("owner.up", bag);
		return result;
	}

	public int delete(String id) {

		int result = my.delete("owner.del", id);

		return result;

	}

	public Owner_memberVO one(String id) {
		Owner_memberVO bag = my.selectOne("owner.one", id);

		return bag;

	}// one

	public List<Owner_memberVO> list() {
		List<Owner_memberVO> list = my.selectList("owner.list");
		System.out.println(list.size());
		return list;

	}

	public Owner_memberVO login(Owner_memberVO bag) {
		return my.selectOne("owner.login", bag);

	}
}
