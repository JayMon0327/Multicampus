package com.multi.mvc00;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class BbsController {
	@Autowired
	BBSDAO dao;
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		//dao에 요청
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(String no) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no) {
		System.out.println("one요청됨.");
		System.out.println(no);
		dao.one(no);
	}
	
	@RequestMapping("list2.multi")
	public void list(BbsVO bag) {
		System.out.println("list요청됨.");
		System.out.println(bag);
		dao.list();
	}
	
}
