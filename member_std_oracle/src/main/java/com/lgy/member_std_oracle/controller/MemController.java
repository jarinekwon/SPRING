package com.lgy.member_std_oracle.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.member_std_oracle.dto.MemDTO;
import com.lgy.member_std_oracle.service.MemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	
	@Autowired
	private MemService service;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String write(@RequestParam HashMap<String, String> param) {
		log.info("@# login_yn");
		
		ArrayList<MemDTO> dtos = service.loginYn(param);
		
		if(dtos.isEmpty())
			return "redirect:login";
		else
		
			if (param.get("mem_pwd").equals(dtos.get(0).getMem_pwd())) {
				return "redirect:login_ok";
			} else {
				return "redirect:login";
			}
	}
	
	@RequestMapping("/login_ok")
	public String login_ok() {
		return "login_ok";
	}
	
	@RequestMapping("/register")
	public String register() {
		log.info("@# register");
		
		return "register";
	}
	
	@RequestMapping("/register_ok")
	public String register_ok(@RequestParam HashMap<String, String> param) {
		log.info("@# register_ok");
		
		service.write(param);
				
		return "redirect:login"; 
	}
}