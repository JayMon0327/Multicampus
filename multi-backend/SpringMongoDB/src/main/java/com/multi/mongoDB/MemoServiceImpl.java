package com.multi.mongoDB;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoServiceImpl implements MemoServiceInterface {

	@Autowired
	MemoDAOImpl dao;
	
	@Override
	public void insert(MemoVO vo) {
		vo.setDate(new Date());
		dao.insert(vo);
	}

	@Override
	public void delete(String _id) {
		dao.delete(_id);
	}

	@Override
	public void update(MemoVO vo) {
		dao.update(vo);
	}

	@Override
	public MemoVO one(String _id) {
		return dao.one(_id);
	}

	@Override
	public List<MemoVO> list() {
		return dao.list();
	}
}
