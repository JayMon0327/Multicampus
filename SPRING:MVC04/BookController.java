package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@Autowired
	BookDAO dao;
	@RequestMapping("bookInsert")
	public void insert(BookVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);
	
	}
	@RequestMapping("bookselect")
	public void select(int id, Model model) {
			System.out.println(id);
		  BookVO bag = dao.select(id);
		  model.addAttribute("bag",bag);
		
	}
	@RequestMapping("bookupdate")
	public void update(BookVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	
	}
	@RequestMapping("bookdelete")
	public void delete(String name) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("update요청됨.");
		System.out.println(name);
		dao.delete(name);
}
	@RequestMapping("booklist")
	public void list(Model model) {
		
		 ArrayList<BookVO> list = dao.list();
		 model.addAttribute("list", list);
	}
}
