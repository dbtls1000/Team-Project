package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.ProgamerVO;

public interface ProgamerDao {
	@Select(" SELECT * FROM tbl_progamer ")
	public List<ProgamerVO> selectAll();
	
	public ProgamerVO findBySeq(long pg_seq);
	
	public int insert(ProgamerVO pgVO);
	
	public int update(ProgamerVO pgVO);
	
	public int delete(long pg_seq);
}
