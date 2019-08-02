package com.biz.progamer.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.biz.progamer.mapper.FileDao;
import com.biz.progamer.model.BoardVO;
import com.biz.progamer.model.FileVO;

@Service
public class FileService {
	
	@Autowired
	FileDao fDao;
	
	private String upLoadFolder = "C:/bizwork/upload";
	
	public List<FileVO> getFileList(BoardVO boardVO){
		
		List<MultipartFile> files = boardVO.getB_files();
		long b_seq = boardVO.getB_seq();
		
		List<FileVO> fileList = new ArrayList<FileVO>();
		for(MultipartFile file : files) {
			String originName = file.getOriginalFilename();
			String uuString = UUID.randomUUID().toString();
			String saveName = uuString + "_" + originName;
			
			fileList.add(FileVO.builder().board_file_seq(b_seq)
										.file_name(saveName)
										.file_origin_name(originName).build());
			
			File upLoadFileName = new File(upLoadFolder,saveName);
			try {
				file.transferTo(upLoadFileName);
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fileList;
	}

	public void insert(List<FileVO> fileList) {
		// TODO Auto-generated method stub
		for(FileVO fileVO : fileList) {
			fDao.insert(fileVO);
		}
	}
	
}
