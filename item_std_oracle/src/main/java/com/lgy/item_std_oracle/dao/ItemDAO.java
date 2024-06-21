package com.lgy.item_std_oracle.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.item_std_oracle.dto.ItemDTO;

public interface ItemDAO {
	
	public ArrayList<ItemDTO> list();	
	public void write(HashMap<String, String> param);
}
