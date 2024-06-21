package com.lgy.member_std_oracle.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.member_std_oracle.dao.MemDAO;
import com.lgy.member_std_oracle.dto.MemDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("MemService")
public class MemServiceImpl implements MemService {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<MemDTO> loginYn(HashMap<String, String> param) {
		log.info("@# MemServiceImpl login_yn");
		
		MemDAO dao = sqlSession.getMapper(MemDAO.class);
		ArrayList<MemDTO> list = dao.loginYn(param);
		
		return list;
	}

	@Override
	public void write(HashMap<String, String> param) {
		log.info("@# MemServiceImpl write");
		
		MemDAO dao = sqlSession.getMapper(MemDAO.class);
		dao.write(param);
	}
	
}
