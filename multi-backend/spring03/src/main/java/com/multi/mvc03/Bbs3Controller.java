package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bbs3Controller {

	@Autowired
	Bbs3DAO dao;
	
	@Autowired
	PageService page;
	
	@RequestMapping("bbsAll")
	public void list3(PageVO vo, Model model) {
		System.out.println("page값>> " + vo);
		vo.setStartEnd(vo.getPage());
		System.out.println("start/end값>> " + vo);
		List<Bbs3VO> list = dao.all(vo);
		int count = dao.count(); //게시물 전체 개수
		int pages = page.pages(count);
		//1page당 5개의 게시물을 넣는 경우
		//count --> 54개, 54/10 --> 5개 + 1개 --> 6개가 필요!! 
		model.addAttribute("list", list); //List
		model.addAttribute("pages", pages); //int
		model.addAttribute("count", count); 
		//Object <-- int(자동형변환, upcasting업캐스팅, 큰<--작)
		//Object --> int(강제형변환, downcating다운캐스팅, 큰-->작)
		//클래스간 타입변환은 상속관계에 있을 때에만 가능
		//Integer <-- String : 불가능!!
		//String age2 = "100";
		//Integer age = (Integer)age2;(X)
		//Integer age3 = Integer.parseInt(age2);(O)
	}
	@RequestMapping("bbsList2")
	public void list2(PageVO vo, Model model) {
		System.out.println("page값>> " + vo);
		vo.setStartEnd(vo.getPage());
		System.out.println("start/end값>> " + vo);
		List<Bbs3VO> list = dao.list2(vo);
		model.addAttribute("list", list);
	}
	@RequestMapping("bbsList")
	public void list(Model model) {
		System.out.println();
		List<Bbs3VO> list = dao.list();
		model.addAttribute("list", list);
	}
}