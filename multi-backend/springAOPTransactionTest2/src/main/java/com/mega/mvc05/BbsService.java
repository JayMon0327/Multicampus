package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {
	
	@Autowired
	BbsDAO dao; //전역변수
	
	public BbsVO2 one(BbsVO2 vo) {
		return dao.select(vo);
	}
	
	
	
	
	
	
	
}
