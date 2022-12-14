package com.hi.mvc001;

import java.util.Date;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
 
 
@Repository //DAO 사용 어노테이션 선언
public class MemoDAOImpl implements MemoDAO {
 
    @Autowired    //MongoDB사용을 하기위해 의존성을 주입한다.
    MongoTemplate mongoTemplate;
    
    String COLLECTION_NAME="memo"; //컬렉션(테이블) 이름을 "memo"라고 한다, 

    
    @Override
    public List<MemoDTO> getMemoList() {
        //목록을 뽑을때 사용하는 클래스 (query)
        Query query=new Query();
        query.with(new Sort(Sort.Direction.DESC, "post_date")); //날짜기준 내림차순 정렬
        return (List<MemoDTO>)mongoTemplate.find(//memo테이블에서 날짜기준으로 내림차순 정렬시킨 값을 DTO타입으로 저장해 리스트를 만들어 리턴하라는 의미이다.
                query, MemoDTO.class, COLLECTION_NAME);
    }
 
    @Override
    public void memoInsert(MemoDTO dto) {//저장할때 날짜를 따로 입력해서 저장하지 않기 때문에  
    	System.out.println("나는 DAO");
        dto.setPost_date(new Date()); 
                                                    
        //java.util.Date
        // insert( 추가할객체, 컬렉션이름 )
       mongoTemplate.insert(dto, COLLECTION_NAME); //코드로 날짜를 집어넣고 insert를 하면 된다.
       System.out.println("나는..진짜..짱이 될꺼야..!!");
    }
 
    @Override
    public MemoDTO memoDetail(String _id) {
        //id에 해당하는 값 (레코드) 1개를 찾을 경우에는 findById(_id, 클래스, 테이블이름) 사용
        return mongoTemplate.findById(
                _id, MemoDTO.class, COLLECTION_NAME);
        //id에 해당되는 자료를 COLLECTION_NAME테이블에서 가져와서 DTO에 저장
    }
 
    @Override
    public void memoUpdate(MemoDTO dto) {
        // update 테이블 set 필드=값, 필드=값 where 필드=값
        // where 조건
        Query query=new Query(
                new Criteria("_id").is(dto.get_id()));
        //테이블에 있는 id와 내가적은 id가 같을경우에 글을 수정할 수 있다.
        //수정할 내용
        Update update=new Update();
        update.set("writer", dto.getWriter());
        update.set("memo", dto.getMemo());
        // upsert : update or insert
        //없으면 추가하고, 있으면 수정한다는 의미이다.
        mongoTemplate.upsert(
                query, update, MemoDTO.class, COLLECTION_NAME);
    }
 
    @Override
    public void memoDelete(String _id) {
        Query query=new Query(new Criteria("_id").is(_id)); //저장되있는 아이디가 내가 입력한 아이디와 같을경우에
        mongoTemplate.remove(query, COLLECTION_NAME);        //테이블에 있는 쿼리를 삭제함
    }
 
}