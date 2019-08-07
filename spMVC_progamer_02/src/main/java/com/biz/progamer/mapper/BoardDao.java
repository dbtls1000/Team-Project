package com.biz.progamer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.UpdateProvider;

import com.biz.progamer.model.BoardDto;
import com.biz.progamer.model.BoardVO;
import com.biz.progamer.model.FileVO;

public interface BoardDao {

	@Select(" SELECT * FROM tbl_board ORDER BY b_time DESC, b_date DESC ")
	public List<BoardVO> selectAll();
	
	
	@InsertProvider(value=BoardSQL.class,method="board_insert_sql")
	@SelectKey(keyProperty = "b_seq",
				statement=" SELECT SEQ_BOARD.NEXTVAL FROM DUAL ",
				resultType = Long.class,
				before = true)
	public int insert(BoardVO boardVO);

	@Select(" SELECT * FROM tbl_file WHERE file_board_seq = #{file_board_seq} ")
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

	
	@UpdateProvider(value=BoardSQL.class,method="board_update_sql")
	public int update(BoardVO boardVO);

	@Delete(" DELETE FROM tbl_board WHERE b_seq = #{b_seq} ")
	public int delete(long b_seq);

}
