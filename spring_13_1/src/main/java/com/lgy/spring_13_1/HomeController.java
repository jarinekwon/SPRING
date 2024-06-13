package com.lgy.spring_13_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
//		return "home";
		return "index";
	}
	@RequestMapping("/index")
	public String goindex() {
		return "index";
	}
	
//	@RequestMapping(method = RequestMethod.GET, value="/student")
//	value 속성을 사용해서 url값 받음
	@RequestMapping(method = RequestMethod.POST, value="/student")
//	post 방식 호출하면 오류가 출력 -> http 상태 405 - 허용되지 않는 메소드
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("studentId", id);
		
		return "student/studentId";
	}
}