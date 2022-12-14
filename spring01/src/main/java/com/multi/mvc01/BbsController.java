package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤으로 만들어주고, 스프링에 컨트롤러 역할을 하도록 등록!
public class BbsController {

	@Autowired
	BbsDAO dao; //주소가 들어가있음.
	
	@RequestMapping("one")
	public void one(int id, Model model) {
		BbsDTO dto = dao.one(id);
		//views까지 처리결과인 dto를 전달해주는 역할
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("insert2.multi")
	public void insert(BbsDTO dto) {
		//1. 데이터를 받아서 dto를 만들어서 집어 넣어라!
		System.out.println(dto);
		//2. dao에 dto를 주고 insert해다라고 요청해라!
		dao.insert(dto);
		//3. 결과를 알려주는 페이지를 호출(insert2.jsp를 호출함: 자동으로!!)
	}
	
	@RequestMapping("delete2.multi")
	public void delete() {
		
	}
}
