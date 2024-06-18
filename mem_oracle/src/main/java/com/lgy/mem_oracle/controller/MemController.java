package com.lgy.mem_oracle.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.mem_oracle.service.MemLoginService;
import com.lgy.mem_oracle.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	MemService service;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String login_yn(HttpServletRequest request, Model model) {
		log.info("@# login_yn");
		
		model.addAttribute("request", request);
		
		service = new MemLoginService();
		int result = service.execute(model);

		if (result == 1) {
//		아이디와 비밀번호가 일치
			return "login_ok";
		} 
		return "redirect:login";
		
	}
	
	@RequestMapping("/login_ok")
	public String login_ok() {
		log.info("@# login_ok");
		
		return "login_ok";
	}
}
