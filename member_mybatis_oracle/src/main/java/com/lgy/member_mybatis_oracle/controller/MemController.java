package com.lgy.member_mybatis_oracle.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.member_mybatis_oracle.dao.MemDAO;
import com.lgy.member_mybatis_oracle.dto.MemDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MemController {
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/login")
	public String login() {
		log.info("@# login");
		
		return "login";
	}
	
	@RequestMapping("/login_yn")
	public String write(HttpServletRequest request, Model model) {
		log.info("@# login_yn");
		
		model.addAttribute("request", request);
		String nPw = request.getParameter("pw");
		
		MemDAO dao = sqlSession.getMapper(MemDAO.class);
		ArrayList<MemDTO> dtos = dao.loginYn(request.getParameter("id"), request.getParameter("pw"));
		
		
		if(dtos.isEmpty())
			return "redirect:login";
		else
			if (nPw.equals(dtos.get(0).getMem_pwd())) {
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
	public String register_ok(HttpServletRequest request, Model model) {
		log.info("@# register_ok");
		
		MemDAO dao = sqlSession.getMapper(MemDAO.class);
		dao.write(request.getParameter("id"), request.getParameter("pw"), request.getParameter("name"));
		
		return "redirect:login"; 
	}
}