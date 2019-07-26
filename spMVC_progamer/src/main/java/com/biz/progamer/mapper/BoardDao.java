package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.BoardVO;

public interface BoardDao {

	@Select(" SELECT * FROM tbl_board ORDER BY b_time DESC, b_date DESC ")
	public List<BoardVO> selectAll();

}
