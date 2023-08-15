package com.multi.mvc901;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DietController {
	@Autowired
	DietDAO dao;
	@RequestMapping("dietInsert")
	public void insert(DietVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	
	}
	@RequestMapping("dietupdate")
	public void update(DietVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
		
	}
	@RequestMapping("dietdelete")
	public void delete(String no) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("delete요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	@RequestMapping("dietone")
	public void one(String no, Model model) {
			System.out.println(no);
		  DietVO bag = dao.one(no);
		  model.addAttribute("bag",bag);
		
	}
	@RequestMapping("dietlist")
	public void list(Model model) {
		 List<DietVO> list = dao.list();
		 model.addAttribute("list", list);
	}
}
