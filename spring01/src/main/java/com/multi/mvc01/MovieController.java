package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public String movie(String movie) {
		if (movie.equals("드라마")) {
			return "drama"; 
			//drame라는   String리턴을 받은 스프링은 views아래에 가서 drama.jsp를 호출한다. 
		}else if (movie.equals("액션")) {
			return "action"; 
		}else if (movie.equals("코믹")) {
			return "comic"; 
		}else {
			return "no";
		}
	}
}
