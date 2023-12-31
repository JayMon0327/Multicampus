package com.multi.mvc03;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@Autowired
	BookDAO dao;
	
	@RequestMapping("jsonBook")
	@ResponseBody
	public List<BookVO> all() {
		List<BookVO> list = dao.all();
		return list;
	}
	
	@RequestMapping("jsonResponse5")
	@ResponseBody
	public MapVO json5(MapVO vo) {
		vo.setName("코엑스");
		vo.setLat(37.5116828);
		vo.setLng(127.059151);
		return vo;
	}
	@RequestMapping("jsonResponse55")
	@ResponseBody
	public ArrayList<MapVO> json55() {
		ArrayList<MapVO> list = new ArrayList<MapVO>();
		MapVO vo = new MapVO();
		vo.setName("멀티캠퍼스 선릉");
		vo.setLat(37.503376);
		vo.setLng(127.059151);
		list.add(vo);
		
		MapVO vo2 = new MapVO();
		vo2.setName("코엑스");
		vo2.setLat(37.5116828);
		vo2.setLng(127.049776);
		list.add(vo2);
		return list;
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
	
	@RequestMapping("jsonResponse2")
	@ResponseBody
	public ArrayList<BookVO> json2() {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		for (int i = 0; i < 100; i++) {
			BookVO vo = new BookVO();
			vo.setId("naver" + i);
			vo.setName("naver" + i);
			vo.setUrl("http://www.naver.com");
			vo.setImg("resources/img/naver.jpg");
			list.add(vo);
		}
		return list;
	}
	
	@RequestMapping("jsonResponse1")
	@ResponseBody
	public BookVO json1(BookVO vo) {
		vo.setId("naver");
		vo.setName("naver");
		vo.setUrl("http://www.naver.com");
		vo.setImg("resources/img/naver.jpg");
		return vo;
	}
}
