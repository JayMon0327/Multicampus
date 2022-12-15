package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoController {

	@Autowired
	MemoServiceImpl memoService;
	
	@RequestMapping("insert.memo")
	public String insert(MemoVO vo) {
		memoService.insert(vo);
		return "redirect:mongo_memo.jsp";
	}
	
	@RequestMapping("update.memo")
	public void update(MemoVO vo) {
		memoService.update(vo);
	}
	
	@RequestMapping("delete.memo")
	public void delete(String _id) {
		memoService.delete(_id);
	}
	
	@RequestMapping("one.memo")
	public void one(String _id, Model model) {
		MemoVO vo = memoService.one(_id);
		System.out.println("하나의 document검색 결과>> " + vo);
		model.addAttribute("vo", vo);
		//ModelAndView 
		//model==> 처리 결과를 넣음. 
		//view ==> views아래에 어떤 파일에 넣을지를 결정. 
	}
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		List<MemoVO> list = memoService.list();
		System.out.println("여러개의 documents검색 결과>> " + list);
		model.addAttribute("list", list);
	}
}
