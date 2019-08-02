package com.biz.progamer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.progamer.mapper.BoardDao;
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

	public int insert(BoardVO boardVO) {
		// TODO Auto-generated method stub
		int ret = bDao.insert(boardVO);
		
		if(boardVO.getB_files().size()>0 && 
				!boardVO.getB_files().get(0).getOriginalFilename().isEmpty()) {
			List<FileVO> fileList = fService.getFileList(boardVO);
			fService.insert(fileList);
		}
		return ret;
	}
}
