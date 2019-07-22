package com.biz.progamer.dao;

import java.util.List;


import com.biz.progamer.model.MemberVO;

public interface MemberDao {
	public List<MemberVO> selectAll();

	public MemberVO findByUserId(String m_userid);

	public int insert(MemberVO memberVO);

	public int update(MemberVO memberVO);

	public int delete(String m_userid);
}
