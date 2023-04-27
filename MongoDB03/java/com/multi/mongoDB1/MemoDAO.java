package com.multi.mongoDB1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository //dao용 어노테이션(저장,DB와 관련있음.)
public class MemoDAO {
	
	@Autowired
	MongoTemplate mongo;

	public List<MemoVO> list() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC,"date"));
	List<MemoVO> list = mongo.find(query, MemoVO.class,"memo");
	return list;
	}
}
