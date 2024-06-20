package com.lgy.item_std_oracle.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.item_std_oracle.dao.ItemDAO;
import com.lgy.item_std_oracle.dto.ItemDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("ItemService")
public class ItemServiceImpl implements ItemService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<ItemDTO> list() {
		log.info("@# ItemServiceImpl wirte_result");
	
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		ArrayList<ItemDTO> list = dao.list();
		
		return list;
	}

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# ItemServiceImpl content_view");
		
		ItemDAO dao = sqlSession.getMapper(ItemDAO.class);
		dao.write(param);
	}
	
	
}
