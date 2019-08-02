package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.ProgamerVO;

public interface ProgamerDao {
	@Select(" SELECT * FROM tbl_progamer ")
	public List<ProgamerVO> selectAll();
	
	@Select(" SELECT * FROM tbl_progamer WHERE pg_seq"
			+ " = #{pg_seq} ")
	public ProgamerVO findBySeq(long pg_seq);
	
	@Select(" SELECT * FROM tbl_progamer WHERE pg_team = #{pg_team} ")
	public List<ProgamerVO> findByTeam(String pg_team);
	
	public int insert(ProgamerVO pgVO);
	
	public int update(ProgamerVO pgVO);
	
	public int delete(long pg_seq);
	
	@Select(" SELECT * FROM tbl_progamer "
			+ " WHERE pg_name LIKE '%' || #{pg_name} || '%' "
			+ " , pg_nick LIKE '%' || #{pg_nick} || '%' ")
	public List<ProgamerVO> findByNameNick(String pg_name);
}
