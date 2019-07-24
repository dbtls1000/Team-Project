package com.biz.progamer.service;

import com.biz.progamer.mapper.ProgamerDao;
import com.biz.progamer.model.ProgamerVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgamerService {
	@Autowired
	ProgamerDao pgDao;

	public List<ProgamerVO> selectAll() {
		// TODO Auto-generated method stub
		List<ProgamerVO> pgList = pgDao.selectAll();
		return pgList;
	}
	
}
