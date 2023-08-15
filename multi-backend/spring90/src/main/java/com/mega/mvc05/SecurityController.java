package com.mega.mvc05;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	@Autowired
	MemberService service;
	
	@Autowired
	BCryptPasswordEncoder pwEncoder;
	
	//회원가입
	@RequestMapping("sInsert.do")
	public void create2(MemberVO memberVO) {
		service.create(memberVO);
	}
		
	
	//로그인
	@RequestMapping("sLogin.do")
	public void sLogin(MemberVO memberVO,Model model) {
		if(service.sLogin(memberVO)) {
			//로그인 성공 시 아이디 세션으로 넘기기
			model.addAttribute("result", "암호화된 로그인 성공");
		}else {
			model.addAttribute("result", "암호화된 로그인 실패");
		}
	}
}
