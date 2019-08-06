package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.biz.progamer.model.BoardDto;
import com.biz.progamer.model.BoardVO;
import com.biz.progamer.model.FileVO;

public interface BoardDao {

	@Select(" SELECT * FROM tbl_board ORDER BY b_time DESC, b_date DESC ")
	public List<BoardVO> selectAll();
	
	
	@InsertProvider(value=BoardSQL.class,method="board_insert_sql")
	public int insert(BoardVO boardVO);

	@Select(" SELECT * FROM tbl_board_file WHERE file_board_seq = #{file_board_seq} ")
	public List<FileVO> getFileList(long b_seq);
	
	@Select(" SELECT * FROM tbl_board ORDER BY b_date DESC, b_time DESC ")
	@Results(value= {@Result(property = "b_seq",column= "b_seq"),
					@Result(property = "b_files",column = "b_seq",javaType=List.class,
					many=@Many(select="getFileList"))
	})
	public List<BoardDto> selectAllForFile();

	@Select(" SELECT * FROM tbl_board WHERE b_seq = #{b_seq} ")
	@Results(value= {@Result(property = "b_seq",column = "b_seq"),
					@Result(property = "b_files",column = "b_seq",javaType=List.class,
					many=@Many(select="getFileList"))
			
	})
	public BoardDto findBySeqForFile(long b_seq);

	@Select(" SELECT * FROM tbl_board WHERE b_seq = #{b_seq} ")
	public BoardVO findBySeq(long b_seq);

}
