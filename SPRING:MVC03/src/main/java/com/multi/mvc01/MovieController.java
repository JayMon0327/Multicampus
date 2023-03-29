package com.multi.mvc01;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {

	@RequestMapping("movie")
	public String movie(String movie) {
		System.out.println("브라우저로 부터 전달받은 값 "+movie);
		if (movie.equals("드라마")) {
			return "drama";
		}else if (movie.equals("코미디")) {
			return "comic";
		}else if (movie.equals("액션")) {
			return "action";
		}else {
			return movie;
		}//if
		
		
	} //moive
	
}
