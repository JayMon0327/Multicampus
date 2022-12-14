package com.mega.mvc05;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sun.print.resources.serviceui;

@Controller
public class BbsController {
	
	@Autowired
	BbsService service;
	
	@Autowired
	ReplyService service2;
	
	
	@RequestMapping("one.do")
	public void one(BbsVO2 bbsVO, Model model, HttpSession session) {
		//로그인한 사람 세션으로 설정!!
		session.setAttribute("id", "apple");
		//게시물 하나를 가지고 오고,
		model.addAttribute("one", service.one(bbsVO));
		//게시물의 댓글 리스트를 가지고 와야함.
		model.addAttribute("list", service2.list(bbsVO.getNo()));
		model.addAttribute("total", service2.list(bbsVO.getNo()).size());
	}
	
	@RequestMapping("delete.do")
	public void delete() {
		//db처리하고, 
		//views로 넘어간다.!!
	}
	
	@RequestMapping("update.do")
	public void update(Model model) {
		//db처리가 들어가 들어가야 하는 경우 
		//반드시 controller를 거쳐야한다.
		//db검색해서 가지고 온다.
		//검색한 결과를 views에 있는 update.jsp로 넘겨야 함.
		model.addAttribute("result", "나는 검색 결과임..");
	}
	
	
	@RequestMapping("insert.do")
	public void insert(BbsVO2 bbsVO, HttpSession session) {
		//입력값으로 vo를 설정하는 경우
		//1) 객체생성: prototype방법
		//2) input name속성과 동일한 set메서드를 자동으로 호출
		//3) 변수이름을 클래스이름의 첫글자를 소문자로 지정하는 경우
		//   자동으로 vo를 model의 속성으로 지정
		//    views의 아래 jsp파일에서 model속성값을 꺼내 쓸 수 있음.
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());
		
		//model은 한번의 request당 response를 하고 사라진다.
		//여러번의 request마다 특정한 값을 유지하고 사용하고 싶으면
		//session으로 설정해야 한다.!
		session.setAttribute("bbsVO2", bbsVO);
		
		
		
		
		
		
		
		
		
	}
}
