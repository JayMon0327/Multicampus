package com.multi.mvc200;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController2 {

	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("insert44")
	public void name(ReplyVO vo) {
		System.out.println(vo);
		dao.insert(vo);
	}
}
