package com.lgy.spring_ex11_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Itaewonclass {
	
	@RequestMapping("actor/actor")
	public String actor(Model model) {
		model.addAttribute("name", "박새로이");
		return "actor/actor";
	}
	
	@RequestMapping("actress/actress")
	public ModelAndView actress() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "조이서");
		mv.setViewName("actress/actress");
		return mv;
	}
}
