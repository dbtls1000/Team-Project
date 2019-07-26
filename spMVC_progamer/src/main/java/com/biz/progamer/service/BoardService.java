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
}
