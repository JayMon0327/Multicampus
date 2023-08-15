package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;

	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag, BbsDAO dao) {
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
	public void update(BbsVO bag, BbsDAO dao) {
		System.out.println("update요청됨.");
		System.out.println(bag);	
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no, BbsDAO dao) {
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		//bbs상세페이지 만들 때, reply list도 함께 가지고 와야함.
		ArrayList<ReplyVO> list = dao2.list(no);
		System.out.println(list.size());
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("one22")
	@ResponseBody 
	//views로 넘어가지 않고, 
	//Return값이 bag데이터를 json으로 만들어서 클라이언트로 전송 
	//클라이언트 브라우저에서는 success: function(x) 
	//결과과 함수의 입력변수인 x로 쏙 들어간다.!
	public BbsVO one22(int no) {
		System.out.println("one요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		return bag;
	}
	
	@RequestMapping("one6")
	public void one6(int no, Model model) {
		System.out.println("one6요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//검색결과가 있는지 프린트!
		System.out.println(bag);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); //사이즈를 찍어보세요.
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list5")
	public void list5(Model model) {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); 
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list55")
	@ResponseBody
	public ArrayList<BbsVO> list55() {
		ArrayList<BbsVO> list = dao.list();
		System.out.println(list.size()); 
		return list;
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
	
	
	
	
	
}
