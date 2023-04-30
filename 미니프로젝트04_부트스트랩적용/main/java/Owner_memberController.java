package com.multi.mvc200;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.SecretKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록!
public class Owner_memberController {
	@Autowired // memberDAO의 싱글톤 객체 ram의 어디에 있는지 찾아서 그 주소를 아래변수에 넣어주세
	Owner_memberDAO dao;

	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색
	@RequestMapping("owner_login")
	public String login(Owner_memberVO bag, HttpSession session, HttpServletRequest request) {
		System.out.println(bag + "login실행됨");
		Owner_memberVO vo = dao.login(bag);
		if (vo != null) {
			String referrer = request.getHeader("Referer");
			request.getSession().setAttribute("prevPage", referrer);
			session.setAttribute("id", vo.getId());
			return "redirect:/board2.jsp";

		} else {
			return "redirect:owner_login.jsp";
		}

	}

	@RequestMapping("owner_insert")
	public void insert(Owner_memberVO bag) {
		// 메서드의 입력변수(파라메터)로 변수를
		// 선언해두면, 컨트롤러내의 메서드내에서는
		// 1)bag을 만들어서
		// 2)클라이언트로 부터 전달된 데이터도 받아줌.
		// 3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		dao.insert(bag);

	}

//	@RequestMapping("update")
//	public void update(Owner_memberVO bag) {
//		System.out.println("update요청됨.");
//		System.out.println(bag);
//		dao.update(bag);
//	}
//	
//	@RequestMapping("delete")
//	public void delete(String id) {
//		System.out.println("delete요청됨.");
//		System.out.println(id);
//		dao.delete(id);
//	}
//	
	@RequestMapping("owner_one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		Owner_memberVO bag = dao.one(id);
		System.out.println(bag);
		model.addAttribute("bag", bag);
		// views아래까지 전달할 데이터를 model객체를 이용해서 속성으로 지정해주세요.

	}
//	
//	@RequestMapping("list")
//	public void list(Model model) {
//		//Model은 컨트롤러의 list를 views/list.jsp까지만 전달할 수 있는 객체
//		System.out.println("list요청됨.");
//		List<Owner_memberVO> list = dao.list();
//		model.addAttribute("list", list);
//	}

	// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8

}