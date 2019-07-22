package com.biz.progamer.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.biz.progamer.dao.MemberDao;
import com.biz.progamer.model.MemberVO;

@Service
public class MemberService {

	MemberDao mDao;
	SqlSession sqlSession;
	
	public void getSqlSession() {
		mDao = sqlSession.getMapper(MemberDao.class);
	}
	
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		List<MemberVO> mList = mDao.selectAll();
		return mList;
	}

	public int insert(MemberVO memberVO) {
		// TODO Auto-generated method stub
		List<MemberVO> mList = mDao.selectAll();
		 
		
		if(mList.size()>0) memberVO.setM_role("USER");
		else memberVO.setM_role("ADMIN");
		
		int ret = mDao.insert(memberVO);
		return ret;
	}
	
}
