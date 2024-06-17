package com.lgy.board_mysql.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.board_mysql.dao.BoardDAO;

// 게시글 저장
public class BoardWriteService implements BoardService {
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
//		DAO에 있는 String boardName, String boardTitle, String boardContent 값들이 필요
//		model 객체에서 꺼내서 전송
		HttpServletRequest request = (HttpServletRequest) map.get("request");
//		request -> 컨트롤러단에서 보내주는 이름
		
		String boardName = request.getParameter("boardName");
		String boardTitle = request.getParameter("boardTitle");
		String boardContent = request.getParameter("boardContent");
		
		BoardDAO dao = new BoardDAO();
		dao.write(boardName, boardTitle, boardContent);
	}
}