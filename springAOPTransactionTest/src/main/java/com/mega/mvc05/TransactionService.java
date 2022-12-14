package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TransactionService {

	@Autowired
	MemberDAO dao;

	@Autowired
	BbsDAO dao2;

	@Transactional
	public int tran(BbsVO2 bbsVO2, MemberVO memberVO) throws Exception {
		System.out.println("내가 호출되긴 한단다..!!!");
		int result = 1;
		dao.insert(memberVO);
		if (0 == dao2.insert(bbsVO2)) {
			System.out.println("에러발생!!!");
			result = 0;
		}
		return result;
	}
}
