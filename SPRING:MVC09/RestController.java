package com.multi.mvc033;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping("json1" )
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public Member1VO json1() {
		Member1VO bag = new Member1VO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("Hong");
		bag.setTel("011");
		return bag; //{"id":"root","pw":"1234","name":"hong","tel":"011"}
	}
	@RequestMapping("json2")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<Member1VO> json2() {
		Member1VO bag = new Member1VO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("Hong");
		bag.setTel("011");
		Member1VO bag2 = new Member1VO();
		bag2.setId("root");
		bag2.setPw("1234");
		bag2.setName("Hong");
		bag2.setTel("011");
		
		ArrayList<Member1VO> list = new ArrayList<Member1VO>();
		list.add(bag);
		list.add(bag2);
		return list;
	}
//	@RequestMapping(value="/json3",
//			produces="application/json; charset=UTF-8"
//			)
//	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
//	public BbsVO json3() {
//		BbsVO bag = new BbsVO();
//		bag.setTitle("root");
//		bag.setNo(12);
//		bag.setContent("dfasd");
//		bag.setWriter("dfdf");
//		return bag; //{"id":"root","pw":"1234","name":"hong","tel":"011"}
//	}
	@RequestMapping("json3")
	@ResponseBody 
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setContent("hahahaha");
		return bag;  
	}
	
	@RequestMapping("json4")
	@ResponseBody 
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setContent("hahahaha");
		
		BbsVO bag2 = new BbsVO();
		bag2.setNo(2);
		bag2.setContent("smile");
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;  
	}
	@RequestMapping("map")
	@ResponseBody
	public mapVO map() {
		mapVO bag = new mapVO();
		bag.setWe(37.5121958);
		bag.setAre(127.0596658);
		System.out.println(bag);
		return bag;
		
	}
	
	@RequestMapping("jsonResponse6")
	@ResponseBody
	public ArrayList<ChartVO> json6() {
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		
		ChartVO vo = new ChartVO();
		vo.setWork("study!");
		vo.setTime(10);
		list.add(vo);
		
		ChartVO vo2 = new ChartVO();
		vo2.setWork("run!");
		vo2.setTime(5);
		list.add(vo2);
		
		ChartVO vo3 = new ChartVO();
		vo3.setWork("eat!");
		vo3.setTime(7);
		list.add(vo3);
		
		return list;
	}
	
}
