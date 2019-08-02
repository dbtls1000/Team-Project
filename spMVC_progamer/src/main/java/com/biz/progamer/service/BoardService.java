package com.biz.progamer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.progamer.mapper.BoardDao;
import com.biz.progamer.model.BoardVO;


@Service
public class BoardService {

	@Autowired
	BoardDao bDao;
	
	public List<BoardVO> selectAll() {
		List<BoardVO> bList = bDao.selectAll();
		
		return bList;
	}

	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		int ret = bDao.insert(boardVO);
		return ret;
	}

	public BoardVO findBySeq(long b_seq) {
		// TODO Auto-generated method stub
		BoardVO boardVO = bDao.findBySeq(b_seq);
		return boardVO;
	}
}
