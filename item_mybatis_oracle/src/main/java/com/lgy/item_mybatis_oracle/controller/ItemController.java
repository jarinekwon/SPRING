package com.lgy.item_mybatis_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.item_mybatis_oracle.dao.ItemDAO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/item_write")
	public String item_write() {
		log.info("@# item_write");
		
		return "item_write";
	}
	
	@RequestMapping("/write_result")
	public String write_reuslt(HttpServletRequest request, Model model) {
		log.info("@# wirte_result");
		
		model.addAttribute("request", request);
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		dao.write(request.getParameter("name"), 
				Integer.parseInt(request.getParameter("price")), 
				request.getParameter("description"));
		
		return "write_result";
	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		model.addAttribute("content_view", dao.list());
		
		return "content_view";
	}
	
}
