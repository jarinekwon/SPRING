package com.lgy.item_oracle.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.item_oracle.service.ItemContentService;
import com.lgy.item_oracle.service.ItemService;
import com.lgy.item_oracle.service.ItemWriteService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {
	ItemService service;
	
	@RequestMapping("/item_write")
	public String item_write() {
		log.info("@# item_write");
		
		return "item_write";
	}
	
	@RequestMapping("/write_result")
	public void write_reuslt(HttpServletRequest request, Model model) {
		log.info("@# wirte_result");
		
		model.addAttribute("request", request);
		
		service = new ItemWriteService();
		service.execute(model);

	}
	
	@RequestMapping("/content_view")
	public String content_view(Model model) {
		log.info("@# content_view");
		
		service = new ItemContentService();
		service.execute(model);
		
		return "content_view";
	}
	
}
