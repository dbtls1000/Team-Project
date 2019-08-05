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

	public List<ProgamerVO> findByNameNick(String pg_gamer) {
		// TODO Auto-generated method stub
		List<ProgamerVO> pgList = pgDao.findByNameNick(pg_gamer);
		return pgList;
	}
	
	public List<ProgamerVO> findByTeam(String pg_team){
		List<ProgamerVO> pgList = pgDao.findByTeam(pg_team);
		return pgList;
	}

	public ProgamerVO findByNum(long pg_num) {
		// TODO Auto-generated method stub
		ProgamerVO progamerVO = pgDao.findByNum(pg_num);
		return progamerVO;
	}
}
