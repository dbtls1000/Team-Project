package com.biz.progamer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.biz.progamer.mapper.MemberDao;
import com.biz.progamer.model.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDao mDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		List<MemberVO> mList = mDao.selectAll();
		return mList;
	}

	public int insert(MemberVO memberVO) {
		// TODO Auto-generated method stub
		String strPassword = memberVO.getM_password();
		String cryptPassword = passwordEncoder.encode(strPassword);
		
		memberVO.setM_password(cryptPassword);
		
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

	public MemberVO login_check(MemberVO memberVO) {
		// TODO Auto-generated method stub
		MemberVO re_memberVO = mDao.login_id_check(memberVO);
		if(re_memberVO != null) {
			String cryptPassword = re_memberVO.getM_password();
			String strPassword = memberVO.getM_password();
			if(passwordEncoder.matches(strPassword, cryptPassword)) {
				return re_memberVO;
			} else {
				return null;
			}
		}
		return null;
	}
}
