package com.multi.mvc901;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BBSDAO dao;
//	@Autowired
//	ReplyDAO dao2;

	@RequestMapping("insert2")
	public void insert(BbsVO bag) {
		
		System.out.println("insert요청됨.");
		System.out.println(bag);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update2")
	public void update(BbsVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2")
	public void delete(BbsVO bag) {
		System.out.println("delete요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
//	
//
//	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		BbsVO bag = dao.one(no);
		System.out.println(bag);
		model.addAttribute("bag", bag);
	}
//	
//	@RequestMapping("list2")
//	public void list(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("list5")
//	public void list5(Model model) {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		model.addAttribute("list", list);
//	}
//	
//	@RequestMapping("Bbsone")
//	public void Bbsone(int no, Model model) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		ArrayList<ReplyVO> list =dao2.list(no);
//		System.out.println(bag);
//		model.addAttribute("list", list);
//		model.addAttribute("bag", bag);
//	}
//	
//	@RequestMapping("one22")
//	@ResponseBody //views로 넘어가지 않고, return값이 bag데이터를 json으로 만들어서 클라이언트로 전송
//	//클라이언트 브라우저에서는 success: function(x);
//	//결과와 함수의 입력변수인 x로 쏙 들어간다 ! 
//	public BbsVO one22(int no) {
//		System.out.println("one요청됨.");
//		System.out.println(no);
//		BbsVO bag = dao.one(no);
//		return bag;
//	}
//	
//	@RequestMapping("list55")
//	@ResponseBody
//	public ArrayList<BbsVO> list55() {
//		ArrayList<BbsVO> list = dao.list();
//		System.out.println(list.size()); //사이즈를 찍어보세요.
//		return list;
//	}
	
	
	

	
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}