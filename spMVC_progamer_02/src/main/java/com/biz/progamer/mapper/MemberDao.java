package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.progamer.model.MemberVO;

public interface MemberDao {
	@Select(" SELECT * FROM tbl_member ")
	public List<MemberVO> selectAll();
	
	@Select(" SELECT * FROM tbl_member WHERE m_userid = #{m_userid} ")
	public MemberVO findByUserId(String m_userid);
	
	@Select(" SELECT * FROM tbl_member " + 
			" WHERE m_userid = #{m_userid} AND m_password = #{m_password} ")
	public MemberVO login(MemberVO memberVO);
	
	@InsertProvider(type=MemberSQL.class,method="member_insert_sql")
	public int insert(MemberVO memberVO);

	@UpdateProvider(type=MemberSQL.class,method="member_update_sql")
	public int update(MemberVO memberVO);

	@Delete(" DELETE FROM tbl_member WHERE m_userid = #{m_userid} ")
	public int delete(String m_userid);
	
	@Select(" SELECT m_userid FROM tbl_member WHERE m_userid = #{m_userid} ")
	public String check_id(String m_userid);
	
	@Select(" SELECT * FROM tbl_member "
			+ " WHERE m_userid = #{m_userid} ")
	public MemberVO login_id_check(MemberVO memberVO);
}
