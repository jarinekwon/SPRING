package com.lgy.item_std_oracle.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.item_std_oracle.dto.ItemDTO;
import com.lgy.item_std_oracle.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/item_write")
	public String item_write() {
		log.info("@# item_write");
		
		return "item_write";
	}
	
	@RequestMapping("/write_result")
	public String write_reuslt(@RequestParam HashMap<String, String> param) {
		log.info("@# wirte_result");
		
		service.write(param);
		
		return "write_result";
	}
	
	@RequestMapping("/content_view")
	public String content_view(@RequestParam HashMap<String, String> param, Model model) {
		log.info("@# content_view");
		
		ArrayList<ItemDTO> dtos = service.list();
		model.addAttribute("content_view", dtos);
		
		return "content_view";
	}
	
}
