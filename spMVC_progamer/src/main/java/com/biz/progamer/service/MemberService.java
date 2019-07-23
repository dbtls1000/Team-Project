package com.biz.progamer.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.progamer.dao.MemberDao;
import com.biz.progamer.model.MemberVO;

@Service
public class MemberService {
	
	MemberDao mDao;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
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
		 
		if(mList.size() > 0) memberVO.setM_role("USER");
		else memberVO.setM_role("ADMIN");
		
		int ret = mDao.insert(memberVO);
		return ret;
	}
	
	public MemberVO login(MemberVO memberVO) {
		String m_userid = memberVO.getM_userid();
		String m_password = memberVO.getM_password();
		
		memberVO = mDao.findByUserId(m_userid);
		if(memberVO.getM_password().equals(m_password)) 
		memberVO = mDao.login(memberVO);
		
		return memberVO;
	}
	
	public String check_id(String m_userid) {
		return mDao.check_id(m_userid);
	}
}
