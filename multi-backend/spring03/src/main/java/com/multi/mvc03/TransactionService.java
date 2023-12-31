package com.multi.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	MemberDAO dao;
	
	@Autowired
	BbsDAO dao2;
	
	@Transactional
	public int tran(MemberVO vo, BbsVO vo2) throws Exception {
		System.out.println("내가 호출되긴 한단다..!!!");
		int result = 1;
		dao.insert(vo);
		if (0 == dao2.insert(vo2)) {
			System.out.println("에러발생!!!");
			result = 0;
		}
		return result;
	}
}
