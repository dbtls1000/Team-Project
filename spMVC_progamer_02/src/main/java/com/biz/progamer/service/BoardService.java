package com.biz.progamer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.progamer.mapper.BoardDao;
import com.biz.progamer.model.BoardDto;
import com.biz.progamer.model.BoardVO;
import com.biz.progamer.model.FileVO;


@Service
public class BoardService {

	@Autowired
	BoardDao bDao;
	
	@Autowired
	FileService fService;
	
	
	public List<BoardVO> selectAll() {
		List<BoardVO> bList = bDao.selectAll();
		
		return bList;
	}
	public List<BoardDto> BoardListForFile(){
		List<BoardDto> bList = bDao.selectAllForFile();
		return bList;
	}

	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		int ret = bDao.insert(boardVO);
		
		if(boardVO.getB_files().size()>0 && 
				!boardVO.getB_files().get(0).getOriginalFilename().isEmpty()) {
			fService.uploadFileList(boardVO);
		}
		return ret;
	}
	public BoardDto getContent(long b_seq) {
		// TODO Auto-generated method stub
		BoardDto bDto = bDao.findBySeqForFile(b_seq);
		return bDto;
	}
	
	public BoardVO findBySeq(long b_seq) {
		// TODO Auto-generated method stub
		BoardVO bVO = bDao.findBySeq(b_seq);
		return bVO;
	}
	
	public int update(BoardVO boardVO) {
		// TODO Auto-generated method stub
		int ret = bDao.update(boardVO);
		
		if(boardVO.getB_files().size()>0 && !boardVO.getB_files().get(0).getOriginalFilename().isEmpty()) {
			fService.uploadFileList(boardVO);
		}
		
		return ret;
	}
	public int delete(long b_seq) {
		// TODO Auto-generated method stub
		int ret = bDao.delete(b_seq);
		return ret;
	}
}
