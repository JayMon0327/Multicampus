package com.multi.weka02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TitanicController {

	@RequestMapping("ml")
	public void ml(	TitanicVO titanicVO, 
					WekaTitanicService wekaTitanicService,
					Model model
					) throws Exception {
		System.out.println(titanicVO);
		
		double[] values = {
				titanicVO.getSexFemale(), 
				titanicVO.getAge(),
				titanicVO.getSibsp(),
				titanicVO.getFare(),
				titanicVO.getClassFirst(),
				titanicVO.getClassSecond(),
				titanicVO.getClassThird()
		};
		
		String[] result = wekaTitanicService.ml(values);
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		model.addAttribute("content", result[0]);
		model.addAttribute("img", result[1]);
	}
}
