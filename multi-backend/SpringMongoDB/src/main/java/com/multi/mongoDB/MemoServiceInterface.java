package com.multi.mongoDB;

import java.util.List;

public interface MemoServiceInterface {

	void insert(MemoVO vo);

	void delete(String _id);

	void update(MemoVO vo);

	MemoVO one(String _id);

	List<MemoVO> list();
}