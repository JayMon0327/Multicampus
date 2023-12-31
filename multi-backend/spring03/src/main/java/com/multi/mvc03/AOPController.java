package com.multi.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {
	
	@Autowired
	ASiteInterface a;
	
	@Autowired
	BSiteInterface b;
	
	@Autowired
	@Qualifier("cSite1")
	CSiteInterface c; //인터페이스를 따르는 클래스를 다 주입해서 사용가능!!
	//CSite, CSite2
	//하나의 이름으로 여러개의 다양한 형태의 객체를 주입해서 사용할 수 있음
	//다형성! (OverLoading,오버로딩)
	
	@RequestMapping("a.do")
	public void a() {
		//login()호출
		a.person();
		//logout()호출
	}
	@RequestMapping("b.do")
	public void b() {
		//login()호출
		b.productOrder();
		//logout()호출
	}
}
