package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.ProgamerVO;

public interface ProgamerDao {
	@Select(" SELECT * FROM tbl_progamer ")
	public List<ProgamerVO> selectAll();
	
	@Select(" SELECT * FROM tbl_progamer WHERE pg_num"
			+ " = #{pg_num} ")
	public ProgamerVO findByNum(long pg_num);
	
	@Select(" SELECT * FROM tbl_progamer WHERE pg_team = #{pg_team} ")
	public List<ProgamerVO> findByTeam(String pg_team);
	
	public int insert(ProgamerVO pgVO);
	
	public int update(ProgamerVO pgVO);
	
	public int delete(long pg_seq);
	
	@Select(" SELECT * FROM tbl_progamer "
			+ " WHERE pg_gamer LIKE '%' || #{pg_gamer} || '%' ")
	public List<ProgamerVO> findByNameNick(String pg_gamer);
}