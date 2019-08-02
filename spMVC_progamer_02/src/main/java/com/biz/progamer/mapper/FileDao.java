package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.FileVO;

public interface FileDao {
	
	@Select(" SELECT * FROM tbl_file ")
	public List<FileVO> selectAll();
	
	@Select(" SELECT * FROM tbl_file WHERE file_seq = #{file_Seq} ")
	public FileVO findBySeq(long file_seq);
	
	@InsertProvider(value=FileSQL.class,method="file_insert_sql")
	public int insert(FileVO fileVO);
	
	
	
	
}
