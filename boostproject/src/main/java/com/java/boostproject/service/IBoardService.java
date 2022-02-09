package com.java.boostproject.service;

import java.util.List;

import com.java.boostproject.model.BoardVO;
import com.java.boostproject.model.Criteria;

public interface IBoardService {	
	
	void insertBoard(BoardVO board);
	
	int countBoard();
	
	List<BoardVO> getListPaging(Criteria cri);
	
	BoardVO getContent(int no);
	
	int selectMax();
	
	void updateBoard(BoardVO board);
	
	void deleteBoard(int no);
}

