package com.multi.mongoDB;

import java.util.List;

public interface MemoDAOInterface {
	//구현해야할 기능만을 정의하는 문서역할
	//데이터 추가 기능
	public void insert(MemoVO vo);
	
	//데이터 삭제 기능
	public void delete(String _id);
	
	//데이터 갱신 기능
	public void update(MemoVO vo);
	
	//데이터 검색 기능(하나으 document)
	public MemoVO one(String _id);
	
	//데이터 검색 기능(여러개의 docuemnt)
	public List<MemoVO> list();
}
