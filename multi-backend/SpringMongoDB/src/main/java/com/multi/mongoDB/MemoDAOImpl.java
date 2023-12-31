package com.multi.mongoDB;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

@Repository
public class MemoDAOImpl implements MemoDAOInterface {

	@Autowired
	MongoTemplate mongo;
	
	@Override
	public void insert(MemoVO vo) {
		//insert(데이터vo, 컬렉션명)
		//vo에 name변수, getName() --> memo컬렉션의 키name: 값getName()
		//Bson객체(JSON)로 만들어 넣습니다.!!
		mongo.insert(vo, "memo");
	}

	@Override
	public void delete(String _id) {
//		Criteria criteria = new Criteria("_id");
//		Query query = new Query(criteria.is(_id));
		Query query = new Query(new Criteria("_id").is(_id));
		//delete from memo where _id = ?
		mongo.remove(query, "memo");
	}

	@Override
	public void update(MemoVO vo) {
		//조건: Query(Criteria)
		Query query = new Query(new Criteria("_id").is(vo.get_id()));
		
		//변경할 값: Update
		Update update = new Update();
		update.set("content", vo.getContent());
		System.out.println("변경할 값>>" + update);
		mongo.updateMulti(query, update, MemoVO.class ,"memo");
		System.out.println("변경후 >> " + vo);
	}

	@Override
	public MemoVO one(String _id) {
		return mongo.findById(_id, MemoVO.class, "memo");
	}

	@Override
	public List<MemoVO> list() {
		Query query = new Query();
		query.with(new Sort(Sort.Direction.DESC, "date"));
		//전체검색을 하는데, date의 역순으로 정렬해서 검색해주세요.!
		return mongo.find(query, MemoVO.class, "memo");
	}

}
