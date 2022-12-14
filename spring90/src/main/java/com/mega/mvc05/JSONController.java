package com.mega.mvc05;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@RequestMapping("json.do")
	@ResponseBody
	public BbsVO2 json() {
		BbsVO2 vo = new BbsVO2();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good coffee");
		vo.setWriter("park");
		return vo;
	}
	
	@RequestMapping("json2.do")
	@ResponseBody
	public ArrayList<BbsVO2> json2() {
		BbsVO2 vo = new BbsVO2();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good coffee");
		vo.setWriter("park");
		
		BbsVO2 vo2 = new BbsVO2();
		vo2.setNo(200);
		vo2.setTitle("bob");
		vo2.setContent("good bob");
		vo2.setWriter("kim");
		
		ArrayList<BbsVO2> list = new ArrayList<>();
		list.add(vo);
		list.add(vo2);
		
		return list;
	}
	
	@RequestMapping("json3.do"                 )
	@ResponseBody
	public String json3() {
		return "성공이야!!";
	}
}
