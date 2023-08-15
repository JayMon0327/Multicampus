package com.multi.weka22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TitanicController {

	@RequestMapping("ml")
	public void ml(	TitanicVO titanicVO,
					WekaTitanicService wekaTitanicService,
				   	Model model) throws Exception {
		System.out.println(titanicVO);
		double[] values = {
				titanicVO.getSexFemale(),
				titanicVO.getAge(),
				titanicVO.getSibsp(),
				titanicVO.getFare(),
				titanicVO.getClassThird(),
				titanicVO.getClassFirst(),
				titanicVO.getClassSecond()
		};
		String[] result = wekaTitanicService.ml(values);
		//ml에 의해 추천받아온다.
		model.addAttribute("content", result[0]);
		model.addAttribute("img", result[1]);
	}
}
