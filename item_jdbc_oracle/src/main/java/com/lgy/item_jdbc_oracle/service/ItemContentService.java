package com.lgy.item_jdbc_oracle.service;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.item_jdbc_oracle.DAO.ItemDAO;
import com.lgy.item_jdbc_oracle.DTO.ItemDTO;



public class ItemContentService implements ItemService {
	
	@Override
	public void execute(Model model) {
		ItemDAO dao = new ItemDAO();
		ArrayList<ItemDTO> dtos = dao.list();
		model.addAttribute("content_view", dtos);
	}
}
