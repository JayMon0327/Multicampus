package com.multi.mvc02;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BBSDAO dao;
	@Autowired
	ReplyDAO dao2;

	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag, BBSDAO dao) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		//dao에게 insert요청!!
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag, BBSDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	

	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		ArrayList<ReplyVO> list =dao2.list(no);
		System.out.println(bag);
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); //사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}